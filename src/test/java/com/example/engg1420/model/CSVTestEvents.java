package com.example.engg1420.model;

import com.example.engg1420.ui.CSVREADERS.CSVReaderSimpleEvent;

import java.util.List;
//test to ensure CSV reader works for respective object
public class CSVTestEvents {
    public static void main(String[] args) {
        try {
            CSVReaderSimpleEvent reader = new CSVReaderSimpleEvent();
            List<EventType> events = reader.readfile();

            for (EventType u : events) {
                System.out.println(u); // uses toString()
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}