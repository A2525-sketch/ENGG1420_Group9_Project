package com.example.engg1420.ui;

import com.example.engg1420.model.User;
import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;

public class CSVReaderSimpleUser {

    public List<User> readfile() throws Exception {
        List<User> users = new ArrayList<>();

        // Load users.csv from resources folder using classpath
        InputStream input = getClass().getResourceAsStream("/Final Project Files/users.csv");
        if (input == null) {
            throw new FileNotFoundException("users.csv not found in resources!");
        }

        // Use CSVReader with InputStreamReader
        try (CSVReader reader = new CSVReader(new InputStreamReader(input))) {
            List<String[]> rows = reader.readAll();

            // Skip header (i = 1)
            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                users.add(new User(
                        row[0], // userid
                        row[1], // name
                        row[2], // email
                        row[3]  // usertype
                ));
            }
        }

        return users;
    }
}