package com.example.engg1420.model;
//child of EventType
public class Concert extends EventType {
    private int age;
    public Concert(String eventid, String title, String date, String location, int capacity, int age){
        super(eventid, title, date, location, capacity);
        //add case dependent event var
        this.age = age;
    }
    //getter for event var
    public int getTopic(){
        return age;
    }
    //getter for event type
    @Override
    public  String getEventType(){
        return "Concert";
    }

}
