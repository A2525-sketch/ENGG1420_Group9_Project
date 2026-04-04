package com.example.engg1420.ui.CSVREADERS;

import com.example.engg1420.model.EventType;
import com.opencsv.CSVReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVReaderSimpleEvent {

    public List<EventType> readfile() throws Exception {
        List<EventType> events = new ArrayList<>();

        // ✅ Load from classpath
        InputStream input = getClass().getResourceAsStream("/Final Project Files/events.csv");

        if (input == null) {
            throw new FileNotFoundException("events.csv not found in resources!");
        }

        try (CSVReader reader = new CSVReader(new InputStreamReader(input))) {
            List<String[]> rows = reader.readAll();

            for (int i = 1; i < rows.size(); i++) { // skip header
                String[] row = rows.get(i);

                // ✅ Prevent crashes on bad rows
                if (row.length < 7) continue;

                int capacity;
                try {
                    capacity = Integer.parseInt(row[4].trim());
                } catch (Exception e) {
                    capacity = 0; // fallback
                }

                events.add(new EventType(
                        row[0].trim(), // event id
                        row[1].trim(), // title
                        row[2].trim(), // date time
                        row[3].trim(), // location
                        capacity,
                        row[5].trim(), // status
                        row[6].trim()  // event type
                ));
            }
        }

        return events;
    }
}