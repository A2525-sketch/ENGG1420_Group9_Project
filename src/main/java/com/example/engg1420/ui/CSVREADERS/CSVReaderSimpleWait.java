package com.example.engg1420.ui.CSVREADERS;

import com.example.engg1420.model.Booking;
import com.example.engg1420.model.BookingStatus;
import com.opencsv.CSVReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVReaderSimpleWait {

    public List<Booking> readfile() throws Exception {
        List<Booking> bookings = new ArrayList<>();


        InputStream input = getClass().getResourceAsStream("/Final Project Files/bookings.csv");

        if (input == null) {
            throw new FileNotFoundException("bookings.csv not found in resources!");
        }

        try (CSVReader reader = new CSVReader(new InputStreamReader(input))) {
            List<String[]> rows = reader.readAll();

            for (int i = 1; i < rows.size(); i++) { // skip header
                String[] row = rows.get(i);


                if (row.length < 5) continue;

                BookingStatus status;


                try {
                    status = BookingStatus.valueOf(row[4].trim().toUpperCase());
                } catch (Exception e) {
                    status = BookingStatus.WAITLISTED;
                }


                if (status == BookingStatus.WAITLISTED) {
                    bookings.add(new Booking(
                            row[0],
                            row[1],
                            row[2],
                            status
                    ));
                }
            }
        }

        return bookings;
    }
}