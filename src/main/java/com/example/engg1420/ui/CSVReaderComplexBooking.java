package com.example.engg1420.ui;

import com.example.engg1420.model.Booking;
import com.example.engg1420.model.BookingStatus;
import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderComplexBooking {

    public List<Booking> readfile(String userId) throws Exception {
        List<Booking> bookings = new ArrayList<>();
        String filePath = "data/bookings_user_" + userId + ".csv";

        File file = new File(filePath);

        // Create file if it doesn't exist
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
            return bookings;
        }

        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            List<String[]> rows = reader.readAll();

            // Skip header
            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);

                if (row.length < 4) continue;

                String bookingId = row[0].trim();
                String userID = row[1].trim();
                String eventID = row[2].trim();
                String statusStr = row[3].trim();

                // Safe enum parsing
                BookingStatus status;
                try {
                    status = BookingStatus.valueOf(statusStr.toUpperCase());
                } catch (Exception e) {
                    status = BookingStatus.WAITLISTED;
                }

                bookings.add(new Booking(bookingId, userID, eventID, status));
            }
        }

        System.out.println("Read " + bookings.size() + " bookings from: " + filePath);
        return bookings;
    }
}