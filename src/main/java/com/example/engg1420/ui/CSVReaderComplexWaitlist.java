package com.example.engg1420.ui;

import com.example.engg1420.model.Booking;
import com.example.engg1420.model.BookingStatus;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderComplexWaitlist {

    public List<Booking> readfile(String userId) throws Exception {
        List<Booking> bookings = new ArrayList<>();
        String currentUserId = userId; // Use the passed user ID
        String filePath = "data/Waitlist_user_" + currentUserId + ".csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> rows = reader.readAll();

            // Skip header if exists
            for (int i = 0; i < rows.size(); i++) {
                String[] row = rows.get(i);

                // Skip invalid or empty rows
                if (row.length < 4) continue;

                String bookingId = row[0].trim();
                String userID = row[1].trim();
                String eventID = row[2].trim();
                String statusStr = row[3].trim();

                // Safely convert string to BookingStatus, default to WAITLISTED
                BookingStatus status;
                if (statusStr.isEmpty() || statusStr.equalsIgnoreCase("null")) {
                    status = BookingStatus.WAITLISTED;
                } else {
                    try {
                        status = BookingStatus.valueOf(statusStr.toUpperCase());
                    } catch (IllegalArgumentException e) {
                        // fallback if the CSV has bad text
                        status = BookingStatus.WAITLISTED;
                    }
                }

                bookings.add(new Booking(bookingId, userID, eventID, status));
            }
        }

        System.out.println("Read " + bookings.size() + " bookings from: " + filePath);
        return bookings;
    }
}