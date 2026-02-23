package com.example.engg1420.model;
//child of user
public class Guest extends User {
    public Guest(String id, String name){
        super(id,name);
    }
    @Override
    public  String getUserType(){
        return "Guest";
    }

}
