package com.example.engg1420.ui;

import com.example.engg1420.model.User;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriterSimpleUser {

    private static final String FILE_PATH = "data/users.csv";

    public void addUser(User user) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {

            writer.append("\n"); // new row
            writer.append(user.getId()).append(",");
            writer.append(user.getName()).append(",");
            writer.append(user.getEmail()).append(",");
            writer.append(user.getUserType());

        }
    }
}