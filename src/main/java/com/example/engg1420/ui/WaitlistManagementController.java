package com.example.engg1420.ui;

import com.example.engg1420.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class WaitlistManagementController {

    @FXML private TextField eventIdField;//Input field where user enters event ID
    @FXML private TextArea outputArea;//Area where results/messages are displated

    private List<Booking> allBookings = new ArrayList<>();//Stores all bookings loaded from file
    private List<EventType> allEvents = new ArrayList<>();//Stores all events loaded from file
    private WaitlistManagement waitlistManager;//Handles waitlist logic
    @FXML
    public void initialize() {//Automatically called when the UI loads
        try {
            CSVReaderSimpleBooking bookingReader = new CSVReaderSimpleBooking(); //Create booking CSV reader
            CSVReaderSimpleEvent eventReader = new CSVReaderSimpleEvent();//Create event CSV reader

            allBookings = bookingReader.readfile();//Load all bookings from CSV
            allEvents = eventReader.readfile();//Load all events from CSV

            waitlistManager = new WaitlistManagement(allBookings);//Initialize waitlist manager with bookings
            waitlistManager.rebuildFromBookings();//Rebuild waitlists from existing data

            outputArea.setText("System ready. Loaded " + allBookings.size()
                    + " bookings and " + allEvents.size() + " events.");

        } catch (Exception e) {
            outputArea.setText("Error loading data: " + e.getMessage());//Show error message
        }
    }

    //view waitlist
    //Displays all waitlisted user for a given event
    @FXML
    private void goViewWaitlist() {
        String eventId = eventIdField.getText().trim();//Get and clean input
        if (eventId.isEmpty()) {
            outputArea.setText("Please enter an Event ID.");//Show error
            return;
        }

        List<Booking> waitlist = waitlistManager.getWaitlist(eventId);//Get waitlist for event
        if (waitlist.isEmpty()) {//If no users in waitlist
            outputArea.setText("No waitlisted users for event: " + eventId);
            return;
        }
        //Build formatted output
        StringBuilder sb = new StringBuilder("=== WAITLIST for " + eventId + " ===\n");
        int position = 1;//Track position in queue
        for (Booking b : waitlist) {//Loop through waitlist
            sb.append(position++)//Add position number
                    .append(". User: ").append(b.getUserId())//Show user ID
                    .append(" | Booking: ").append(b.getBookingId())//Show booking ID
                    .append(" | Since: ").append(b.getCreatedAt())//Show timestamp
                    .append(" | Status: ").append(b.getStatus())//Show status
                    .append("\n");//New line
        }
        outputArea.setText(sb.toString()); //Display result in UI
    }

    // Remove first Waitlisted booking
    //Simulates cancelling the first waitlisted booking
    @FXML
    private void goRemoveWaitlist() {
        String eventId = eventIdField.getText().trim();//Get event ID input
        if (eventId.isEmpty()) {//Validate input
            outputArea.setText("Please enter an Event ID.");
            return;
        }

        List<Booking> waitlist = waitlistManager.getWaitlist(eventId);//Get waitlist
        if (waitlist.isEmpty()) {//If no user
            outputArea.setText("No waitlisted users to remove for event: " + eventId);
            return;
        }

        //Remove the first waitlisted user (their booking was cancelled)
        String firstUserId = waitlist.get(0).getUserId();
        waitlistManager.removeFromWaitlist(eventId, firstUserId);
//Display confirmation message
        outputArea.setText("Waitlisted booking for User " + firstUserId
                + " has been cancelled and removed from waitlist for event " + eventId + ".\n"
                + "Remaining waitlist size: " + waitlistManager.getWaitlistSize(eventId));
    }

    //Promote next user
    // Promotes first waitlisted user to CONFIRMED

    @FXML
    private void goPromoteUser() {
        String eventId = eventIdField.getText().trim();//Get event ID
        if (eventId.isEmpty()) {//Validate input
            outputArea.setText("Please enter an Event ID.");
            return;
        }

        EventType event = findEvent(eventId);//Find event object
        if (event == null) {//If event not found
            outputArea.setText("Event not found: " + eventId);
            return;
        }
//Promote next waitlisted user
        Booking promoted = waitlistManager.promoteNext(eventId, event);
        if (promoted != null) {//If promotion happened
            outputArea.setText("PROMOTION: User " + promoted.getUserId()
                    + " has been promoted to CONFIRMED for event " + eventId + "!\n"
                    + "Remaining waitlist size: " + waitlistManager.getWaitlistSize(eventId));
        } else {//If no one to promote
            outputArea.setText("No waitlisted users to promote for event: " + eventId);
        }
    }

    // Helper: find EventType by ID
    private EventType findEvent(String eventId) {
        for (EventType e : allEvents) {//Loop through all events
            if (e.getEventid().equals(eventId)) return e;//Return matching event
        }
        return null;//Return null if not found
    }
}