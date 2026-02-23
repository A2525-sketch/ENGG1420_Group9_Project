package com.example.engg1420.model;
//child of user
public class Staff extends User {
    public Staff(String id, String name){
        super(id,name);
    }
    @Override
    public  String getUserType(){
        return "Staff";
    }

}
