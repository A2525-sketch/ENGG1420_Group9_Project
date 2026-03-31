package com.example.engg1420.ui;

import com.example.engg1420.model.Booking;
import com.example.engg1420.model.BookingStatus;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CSVReaderComplexBooking {

    public List<Booking> readfile(String id) throws Exception {
        List<Booking> bookings = new ArrayList<>();
        String currentUserId = BookingManagementController.Session.currentUserId;
        String filePath = "data/bookings_user_" + currentUserId + ".csv";

        try (CSVReader reader = new CSVReader(
                new FileReader(filePath))) {

            List<String[]> rows = reader.readAll();

            // skip header
            IntStream.range(1, rows.size()).mapToObj(rows::get).forEachOrdered(row -> {
                BookingStatus status = BookingStatus.valueOf(
                        row[4].trim().toUpperCase()
                );
                bookings.add(new Booking(
                        row[0], // bookingId
                        row[1], // userId
                        row[2], // eventId
                        row[3], // createdAt
                        status  // bookingStatus
                ));
            });
        }
        System.out.println("Reading file: " + filePath);
        return bookings;
    }


}
