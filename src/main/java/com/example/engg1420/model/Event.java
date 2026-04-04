package com.example.engg1420.model;

import java.util.ArrayList;
import java.util.List;

public class Event {
    static private List<EventType> events = new ArrayList<>();

    // edit event
    public void setEvent(String eventid, String title, String date, String location, int capacity, String temp1, String temp2, int eventNum, String temp3){
        if(eventNum == 0){
            EventType e1 = new Workshop(eventid, title, date, location, capacity, temp1, temp2, temp3);

            //events.add(0, e1);
        } else if(eventNum == 1){
            EventType e2 = new Seminar(eventid, title, date, location, capacity, temp1, temp2, temp3);
            //events.add(1, e2);
        } else if(eventNum == 2){
            EventType e3 = new Concert(eventid, title, date, location, capacity, 18, temp2, temp3);
            //events.add(2, e3);
        }
    }

    // create new event
    public void createEvent(){

    }
}