package com.example.engg1420.ui.CSVREADERS;

import com.example.engg1420.model.User;
import com.opencsv.CSVReader;

import java.io.*;
import java.util.*;

public class CSVReaderSimpleUser {

    private static final String FILE_PATH = "data/users.csv";

    public List<User> readfile() throws Exception {
        List<User> users = new ArrayList<>();

        File file = new File(FILE_PATH);

        // Ensure folder and file exist
        if (!file.exists()) {
            file.getParentFile().mkdirs(); // create data/ folder
            file.createNewFile();          // create empty CSV
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("userId,name,email,userType\n"); // header
            }
        }

        // Read CSV from file
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            List<String[]> rows = reader.readAll();

            // Skip header
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