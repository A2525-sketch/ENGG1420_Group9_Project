package com.example.engg1420.model;

import com.example.engg1420.ui.CSVReaderSimpleUser;
import java.sql.Connection;
import java.util.List;

public class CSVTestuser {
    public static void main(String[] args) {
        try {
            CSVReaderSimpleUser reader = new CSVReaderSimpleUser();
            List<User> users = reader.readfile();

            Connection conn = DBConnection.getConnection();

            for (User u : users) {
                usertoDB.insertUser(conn, u);
            }

            conn.close();

            System.out.println("All users uploaded successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}