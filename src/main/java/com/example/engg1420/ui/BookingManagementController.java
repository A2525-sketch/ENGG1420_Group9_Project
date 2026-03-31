package com.example.engg1420.ui;

import com.example.engg1420.model.Booking;
import com.example.engg1420.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;

import java.util.List;

public class BookingManagementController {

    @FXML
    private ListView<String> bookinglist;
    @FXML
    private ListView<String> mybookinglist;
    private List<User> users;
    @FXML
    private ListView<String> bookingList;
    private ObservableList<String> bkObservableList;

    @FXML
    private Label loginstatus;

    @FXML
    public void initialize() {
        // Initialize bookings list (you already have this)
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
            users = reader.readfile(); // <-- assign to field, not local variable
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
                System.out.println("Logged in as: " + u.getName());
                loginstatus.setText("Logged in as: " + u.getName());
                break;
            }
        }

        if (!login) {
            loginstatus.setText("Login failed: no user with ID " + enteredId);
        }

    }
    @FXML
    private void handleBook() {
        System.out.println("Book button clicked!"); // DEBUG
        String selected = mybookinglist.getSelectionModel().getSelectedItem();
        if (selected == null) return;

        String[] parts = selected.split("\\|");
        String userId = parts[0].trim();

        // Create Booking object
        Booking booking = new Booking(
                "B" + System.currentTimeMillis(),
                userId,
                "E101", // later: from event selection
                java.time.LocalDateTime.now().toString(),
                com.example.engg1420.model.BookingStatus.CONFIRMED
        );

        // Save to user-specific CSV
        saveBookingForUser writer = new saveBookingForUser();
        writer.saveBookingForUser(booking);

        System.out.println("Saved booking for user: " + userId);
        //load user bookings
        String filename = "bookings_user_" + userId + ".csv";

        bookingList.getItems().clear();

        try (java.io.BufferedReader reader =
                     new java.io.BufferedReader(new java.io.FileReader(filename))) {

            String line;
            while ((line = reader.readLine()) != null) {
                bookingList.getItems().add(line);
            }

        } catch (Exception e) {
            System.out.println("No bookings yet for this user.");
        }

    }
    @FXML
    private void handleCancel() {
        if(login == true){}
    }

}








