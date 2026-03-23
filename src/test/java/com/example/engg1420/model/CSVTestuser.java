package com.example.engg1420.model;

import com.example.engg1420.ui.CSVReaderSimpleUser;
import java.util.List;

public class CSVTestuser {
    public static void main(String[] args) {
        try {
            CSVReaderSimpleUser reader = new CSVReaderSimpleUser();
            List<User> users = reader.readfile();

            for (User u : users) {
                System.out.println(u); // uses toString()
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}