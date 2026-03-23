package com.example.engg1420.model;
//Parent for user types, student, staff, guest
public class User {
    private String id;
    private String name;
    private String email;
    private String userType;

    //Constructor
    public User(String id, String name, String email, String userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userType = userType;
    }
    //Getters
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }

    public String getUserType() { return userType; }

    @Override
    public String toString() {
        return name + ", " + id + ", " + email + ", " + userType;
    }
}
