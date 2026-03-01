package com.example.engg1420.model;
//child of EventType
public class Seminar extends EventType {
    private String Speaker;
    public Seminar(String eventid, String title, String date, String location, int capacity, String Speaker){
        super(eventid, title, date, location, capacity);
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
