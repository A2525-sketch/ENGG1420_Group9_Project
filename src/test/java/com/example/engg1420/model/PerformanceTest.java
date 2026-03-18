package com.example.engg1420.model;

import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @Test
    public void testBookingPerformance() {
        BookingManager manager = new BookingManager();
        EventType event = new Workshop("E1", "Big Event", "2026", "Hall", 1000, "Tech");

        long start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            User user = new Student(String.valueOf(i), "User" + i);
            manager.CreateBooking(user, event);
        }

        long end = System.nanoTime();

        System.out.println("Time taken: " + (end - start) + " ns");
    }
}