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
    private ListView<String> bookinglist; // must match fx:id in FXML
    private List<User> users;
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
        if(login == true){}
    }
    @FXML
    private void handleCancel() {
        if(login == true){}
    }

}








