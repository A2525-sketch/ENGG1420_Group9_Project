package com.example.engg1420.model;
//child of user
public class Guest extends User {
    public Guest(String id, String name, String email, String userType){
        super(id,name,email,userType);
    }
    @Override
    public  String getUserType(){
        return "Guest";
    }

}
