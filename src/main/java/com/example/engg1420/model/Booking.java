package com.example.engg1420.model;

public class Booking {
    private String bookingId;
    private String userId;
    private String eventId;
    private String createdAt;

    private EventType event;
    private User user;
    private BookingStatus status;

   //constructor
    public Booking(String bookingId, String userId, String eventId, String createdAt, BookingStatus status) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.eventId = eventId;
        this.createdAt = createdAt;
        this.status = status;
    }

    // Constructor for object-based usage
    public Booking(User user, EventType event, BookingStatus status) {
        this.user = user;
        this.event = event;
        this.status = status;
    }

    // SETTERS
    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEvent(EventType event) {
        this.event = event;
    }

    // GETTERS
    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public String getEventId() {
        return eventId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public EventType getEvent() {
        return event;
    }

    public User getUser() {
        return user;
    }
}