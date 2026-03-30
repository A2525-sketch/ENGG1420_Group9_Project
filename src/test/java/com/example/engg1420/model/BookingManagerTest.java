/*package com.example.engg1420.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingManagerTest {

    @Test
    public void testConfirmedBooking() {
        BookingManager manager = new BookingManager();
        User user = new Student("1", "Anas");
        EventType event = new Workshop("E1", "Java", "2026", "Room", 2, "Programming");

        Booking booking = manager.CreateBooking(user, event);

        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    @Test
    public void testWaitlistedBooking() {
        BookingManager manager = new BookingManager();
        EventType event = new Workshop("E1", "Java", "2026", "Room", 1, "Programming");

        User user1 = new Student("1", "A");
        User user2 = new Student("2", "B");

        manager.CreateBooking(user1, event);
        Booking booking2 = manager.CreateBooking(user2, event);

        assertEquals(BookingStatus.WAITLISTED, booking2.getStatus());
    }

    @Test
    public void testSeatBooking() {
        EventType event = new Workshop("E1", "Java", "2026", "Room", 1, "Programming");

        assertTrue(event.hasOpenSeats());
        event.bookSeat();
        assertFalse(event.hasOpenSeats());
    }

    @Test
    public void testCancelSeat() {
        EventType event = new Workshop("E1", "Java", "2026", "Room", 1, "Programming");

        event.bookSeat();
        event.cancelSeat();

        assertTrue(event.hasOpenSeats());
    }

    @Test
    public void testUserTypes() {
        User s = new Student("1", "Anas");
        User st = new Staff("2", "John");
        User g = new Guest("3", "Mike");

        assertEquals("Student", s.getUserType());
        assertEquals("Staff", st.getUserType());
        assertEquals("Guest", g.getUserType());
    }

    @Test
    public void testBookingData() {
        User user = new Student("1", "Anas");
        EventType event = new Workshop("E1", "Java", "2026", "Room", 2, "Programming");

        Booking booking = new Booking(user, event, BookingStatus.CONFIRMED);

        assertEquals(user, booking.getUser());
        assertEquals(event, booking.getEvent());
    }
}
*/
