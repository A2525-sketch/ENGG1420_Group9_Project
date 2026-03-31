package com.example.engg1420.ui;

import com.example.engg1420.model.Booking;
import com.example.engg1420.model.BookingStatus;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.ObjectInputFilter;
import java.util.*;

public class CSVReaderSimpleWait {

    public List<Booking> readfile() throws Exception {
        List<Booking> bookings = new ArrayList<>();

        try (CSVReader reader = new CSVReader(
                new FileReader("src/main/resources/Final Project Files/bookings.csv"))) {

            List<String[]> rows = reader.readAll();

            for (int i = 1; i < rows.size(); i++) { // skip header
                String[] row = rows.get(i);

                BookingStatus status = BookingStatus.valueOf(
                        row[4].trim().toUpperCase()
                );

                //  ONLY keep waitlisted bookings
                if (status == BookingStatus.WAITLISTED) {
                    bookings.add(new Booking(
                            row[0], // bookingId
                            row[1], // userId
                            row[2], // eventId
                            status
                    ));
                }
            }
        }

        return bookings;
    }
}