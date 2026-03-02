package com.example.engg1420.model;

import java.util.ArrayList;
import java.util.List;



public class Event {
    static private List<EventType> events = new ArrayList<>();
    String input;

    //edit event
    public void setEvent(String eventid, String title, String date, String location, int capacity, String temp1, int temp2, int eventNum){
        if(input == "Workshop"){
            EventType e1 = new Workshop(eventid, title, date, location, capacity, temp1);
            events.add(0, e1);
        }else if(input == "Seminar"){
            EventType e2 = new Seminar(eventid, title, date, location, capacity, temp1);
            events.add(1, e2);
        }else if(input == "Concert"){
            EventType e3 = new Concert(eventid,title, date, location, capacity, temp2);
            events.add(2, e3);
        }

    }
    //create new event
    public void createEvent(){

    }
}
