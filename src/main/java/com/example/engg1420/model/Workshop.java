package com.example.engg1420.model;
//child of EventType
public class Workshop extends EventType {
    private String topic;
    public Workshop(String eventid, String title, String date, String location, int capacity, String topic){
        super(eventid, title, date, location, capacity);
        //add case dependent event var
        this.topic = topic;
    }
    //getter for event var
    public String getTopic(){
        return topic;
    }
    //getter for event type
    @Override
    public  String getEventType(){
        return "Workshop";
    }

}
