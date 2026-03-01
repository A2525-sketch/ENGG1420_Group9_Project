package com.example.engg1420.model;
//Parent for user types, student, staff, guest
public abstract class User {
    private String id;
    private String name;

    //Constructor
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //Getters
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public abstract String getUserType();
}
