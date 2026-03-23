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

            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                Events.add(new EventType(
                        row[0],
                        row[1],
                        row[2],
                        row[3],
                        Integer.parseInt(row[4]),
                        row[5],
                        row[6]

                ));
            }
        }

        return Events;
    }
}