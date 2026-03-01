package com.example.engg1420.model;
/*main booking control script
use this for storing the booking info, seeing if we can find the user a seat and were to allocate the seat,
waitlist and cancellations can also be put here
 */
import java.util.ArrayList;
import java.util.List;
public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public Booking CreateBooking(User user, EventType event) {
        if (event.hasOpenSeats()) {
            event.bookSeat();
            Booking booking = new Booking(user, event, BookingStatus.CONFIRMED);
            bookings.add(booking);
            return booking;
        }
        else{
            Booking booking = new Booking(user, event, BookingStatus.WAITLISTED);
            bookings.add(booking);
            return booking;
        }
    }
}