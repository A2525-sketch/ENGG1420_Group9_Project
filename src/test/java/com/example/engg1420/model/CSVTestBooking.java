package com.example.engg1420.model;

import com.example.engg1420.ui.CSVReaderSimpleBooking;
import java.util.List;
//test to ensure CSV reader works for respective object
public class CSVTestBooking {
    public static void main(String[] args) {
        try {
            CSVReaderSimpleBooking reader = new CSVReaderSimpleBooking();
            List<Booking> bookings = reader.readfile();

            for (Booking b : bookings) {
                System.out.println(
                        b.getBookingId() + " | " +
                                b.getUserId() + " | " +
                                b.getEventId() + " | " +
                                b.getCreatedAt() + " | " +
                                b.getStatus()
                );
            }

            System.out.println("\nTotal bookings: " + bookings.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}