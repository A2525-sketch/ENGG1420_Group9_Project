package com.example.engg1420.ui;

import com.example.engg1420.model.User;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

public class CSVReaderSimpleUser {
    public List<User> readfile() throws Exception {
        List<User> users = new ArrayList<>();
// create an array called users to hold all users
        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/Final Project Files/users.csv"))) {
            List<String[]> rows = reader.readAll();
// read entire file from source
            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                users.add(new User( //create new object: User with following params
                        row[0], //userid
                        row[1], //name
                        row[2], //email
                        row[3] //usertype
                ));
            }
        }

        return users;
    }
}