package com.example.engg1420.model;
//Parent for usertypes, student, staff, guest
public abstract class User {
    private String id;
    private String name;

    public User(String id, String Name){
        this.id = id;
        this.name = name;
    }
    public String getid(){return id;}
    public String getName(){return name;}
public abstract String getUserType();
}
