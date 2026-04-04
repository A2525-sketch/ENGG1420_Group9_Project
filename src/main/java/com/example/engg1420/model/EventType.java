package com.example.engg1420.model;
//Parent of Concert, Seminar, Workshop

public class EventType {
    private String eventid;
    private String title;
    private String date;
    private String location;
    private int capacity;
    private int bookedSeats = 0;
    private String eventType;
    private String event;
//constructors
    public EventType(String eventid, String title, String date, String location, int capacity, String eventType, String event){
        this.eventid = eventid;
        this.title = title;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
        this.eventType = eventType;
        this.event = event;
    }
    public EventType(String eventid, String title, String date, String location, int capacity, String eventType){
        this.eventid = eventid;
        this.title = title;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
        this.eventType = eventType;

    }



    public EventType(){}
    //seat controllers

    public boolean hasOpenSeats(){
        return bookedSeats < capacity;
    }
    public void bookSeat(){
        if(hasOpenSeats()){
            bookedSeats++;
        }
    }
    public void cancelSeat(){
        if(bookedSeats>0){
            bookedSeats--;
        }
    }


    //getters
    public String getEventid(){return eventid;}
    public String getTitle(){return title;}
    public String getDate(){return date;}
    public String getLocation(){return location;}
    public int getCapacity(){return capacity;}
    public String getEventType() { return eventType; }
    @Override
    public String toString() {
        return eventid + ", "
                + title + ", "
                + date + ", "
                + location + ", "
                + capacity + ", "
                + bookedSeats + ", "
                + eventType + ", "
                + event + ", ";

    }
}
