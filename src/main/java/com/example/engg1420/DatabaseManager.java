package com.example.engg1420;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class DatabaseManager {

    private static MongoDatabase database;

    public static void connect() {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        database = client.getDatabase("campusDB");
        System.out.println("Connected to MongoDB!");
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}