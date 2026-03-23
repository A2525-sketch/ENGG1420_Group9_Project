package com.example.engg1420.ui;

import com.example.engg1420.model.User;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

public class CSVReaderSimple {
    public List<User> readfile() throws Exception {
        List<User> reviews = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/Final Project Files/users.csv"))) {
            List<String[]> rows = reader.readAll();

            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                reviews.add(new User(
                        row[0],
                        row[1],
                        row[2],
                        row[3]
                ));
            }
        }

        return reviews;
    }
}