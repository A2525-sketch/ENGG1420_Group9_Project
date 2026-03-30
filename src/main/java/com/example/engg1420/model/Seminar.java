package com.example.engg1420.model;
//child of EventType
public class Seminar extends EventType {
    private String Speaker;
    public Seminar(String eventid, String title, String date, String location, int capacity, String eventType, String Speaker, String event){
        super(eventid, title, date, location, capacity, eventType, event);
        //add case dependent event var
        this.Speaker = Speaker;
    }
    //getter for event var
    public String getSpeaker(){
        return Speaker;
    }
    //getter for event type
    @Override
    public  String getEventType(){
        return "Seminar";
    }

}
