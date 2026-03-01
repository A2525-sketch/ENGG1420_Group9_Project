package com.example.engg1420.model;
//class for creating the bookings
//example attach the object user, etc.. to one new object called booking then have getters to call on that info for later
public class Booking {
    private EventType event;
    private User user;
    private BookingStatus status;
//event constructor
    public Booking(User user, EventType event, BookingStatus status){
        this.event = event;
        this.user = user;
        this.status = status;
    }
    //setters
    public void SetStatus(BookingStatus status){
        this.status = status;
    }
    //getters
    public BookingStatus getStatus(){
        return status;
    }
    public EventType getEvent(){
        return event;
    }
    public User getUser(){
        return user;
    }
}


