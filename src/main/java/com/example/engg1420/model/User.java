package com.example.engg1420.model;
//Parent for user types, student, staff, guest
public abstract class User {
    private String id;
    private String name;
//constructor
    public User(String id, String Name){
        this.id = id;
        this.name = name;
    }
    //getters
    public String getid(){return id;}
    public String getName(){return name;}
public abstract String getUserType();
}
