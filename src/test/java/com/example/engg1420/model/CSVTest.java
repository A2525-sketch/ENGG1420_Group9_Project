package com.example.engg1420.model;

import com.example.engg1420.model.User;
import com.example.engg1420.ui.CSVReaderSimple;
import java.util.List;

public class CSVTest {
    public static void main(String[] args) {
        try {
            CSVReaderSimple reader = new CSVReaderSimple();
            List<User> users = reader.readfile();

            for (User u : users) {
                System.out.println(u); // uses toString()
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}