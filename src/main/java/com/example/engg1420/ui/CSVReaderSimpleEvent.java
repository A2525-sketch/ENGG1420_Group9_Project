package com.example.engg1420.ui;
import com.example.engg1420.model.EventType;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

public class CSVReaderSimpleEvent {
    public List<EventType> readfile() throws Exception {
        List<EventType> Events = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/Final Project Files/events.csv"))) {
            List<String[]> rows = reader.readAll();
// read file from source then add the all to Events array
            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                Events.add(new EventType( // create new events with the params:
                        row[0], // event id
                        row[1], // title
                        row[2], // date time
                        row[3], // locaiton
                        Integer.parseInt(row[4]), // capacity
                        row[5],// status
                        row[6] // event type

                ));
            }
        }

        return Events;
    }
}