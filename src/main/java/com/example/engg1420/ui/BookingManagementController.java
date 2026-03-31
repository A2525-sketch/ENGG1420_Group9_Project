package com.example.engg1420.ui;

import com.example.engg1420.model.Booking;
import com.example.engg1420.model.BookingStatus;
import com.example.engg1420.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;

import java.util.List;

public class BookingManagementController {
    private User loggedInUser;
    private BookingStatus statusEnum;

    public class Session {
        public static String currentUserId;
    }
    @FXML
    private ListView<String> bookinglist;
    @FXML
    private ListView<String> mybookinglist;
    private List<User> users;
    @FXML
    private ListView<String> bookingList;
    private ObservableList<String> bkObservableList;
    private ObservableList<String> myBkObservableList;

    @FXML
    private Label loginstatus;

    @FXML
    public void initialize() {
        // Initialize bookings list
        myBkObservableList = FXCollections.observableArrayList();
        mybookinglist.setItems(myBkObservableList);
        bkObservableList = FXCollections.observableArrayList();
        bookinglist.setItems(bkObservableList);

        // Load bookings from CSV...
        try {
            CSVReaderSimpleBooking reader = new CSVReaderSimpleBooking();
            List<Booking> bookings = reader.readfile();
            for (Booking b : bookings) {
                bkObservableList.add(
                        b.getBookingId() + " | " + b.getUserId() + " | " + b.getEventId() + " | " + b.getStatus()
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // **Load users here**
        try {
            CSVReaderSimpleUser reader = new CSVReaderSimpleUser();
            users = reader.readfile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //buttons
    //require login first
    boolean login = false;

    @FXML
    private void handleLogin() {
        TextInputDialog idDialog = new TextInputDialog();
        idDialog.setTitle("Login");
        idDialog.setHeaderText("Enter your user ID to log in:");
        idDialog.setContentText("User ID:");

        String enteredId = idDialog.showAndWait().orElse(null);
        if (enteredId == null || enteredId.isEmpty()) return;

        login = false; // reset

        for (User u : users) {
            if (u.getId().equals(enteredId)) {
                login = true;
                loggedInUser = u;
                System.out.println("Logged in as: " + u.getName());
                loginstatus.setText("Logged in as: " + u.getName());
                Session.currentUserId = loggedInUser.getId();
                break;
            }
        }

        if (!login) {
            loginstatus.setText("Login failed: no user with ID " + enteredId);
        }

    }

    @FXML
    private void handleBook() {
        if (loggedInUser == null) {
            System.out.println("You must log in first!");
            return;
        }

        // Get the selected booking string
        String selected = bookinglist.getSelectionModel().getSelectedItem();
        if (selected == null || selected.isEmpty()) {
            System.out.println("No booking selected!");
            return;
        }

        //  Parse the selected string back into a Booking object
        // Expected format: "B1002 | U002 | E101 | CONFIRMED"
        String[] parts = selected.split(" \\| ");
        if (parts.length < 4) {
            System.out.println("Selected booking has invalid format: " + selected);
            return;
        }

        // Create booking object
        Booking booking = new Booking(
                parts[0].trim(), // bookingId
                loggedInUser.getId(), // userId
                parts[2].trim(), // eventId
                parts[3].trim(), // createdAt
                BookingStatus.CONFIRMED   // force a valid status for testing
        );

        // Save booking to user's CSV file using your existing saver
        try {
            saveBookingForUser saver = new saveBookingForUser();
            saver.saveBookingForUser(booking);
            System.out.println("Saved booking for user: " + loggedInUser.getId());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Reload the user's bookings into mybookinglist safely
        try {
            CSVReaderComplexBooking reader = new CSVReaderComplexBooking();
            List<Booking> bookings = reader.readfile(loggedInUser.getId());

            // Clear previous entries to avoid duplicates
            myBkObservableList.clear();

            for (Booking b : bookings) {
                myBkObservableList.add(
                        b.getBookingId() + " | " + b.getUserId() + " | " + b.getEventId() + " | " + b.getStatus()
                );
            }

            System.out.println("Reloaded " + bookings.size() + " bookings for user: " + loggedInUser.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void handleCancel() {
    }
}









