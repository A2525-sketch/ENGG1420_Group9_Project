package com.example.engg1420.model;
//child of EventType
public class Workshop extends EventType {
    private String topic;
    public Workshop(String eventid, String title, String date, String location, int capacity, String eventType, String topic, String event){
        super(eventid, title, date, location, capacity, eventType, event);
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
