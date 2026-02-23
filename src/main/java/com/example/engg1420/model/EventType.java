package com.example.engg1420.model;
//Parent of Concert, Seminar, Workshop

public abstract class EventType {
    private String eventid;
    private String title;
    private String date;
    private String location;
    private int capacity;

    public EventType(String eventid, String title, String date, String location, int capacity){
        this.eventid = eventid;
        this.title = title;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
    }
    public String getEventid(){return eventid;}
    public String getTitle(){return title;}
    public String getDate(){return date;}
    public String getLocation(){return location;}
    public int getCapacity(){return capacity;}
    public abstract String getEventType();
}
