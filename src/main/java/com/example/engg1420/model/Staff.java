package com.example.engg1420.model;
//child of user
public class Staff extends User {
    public Staff(String id, String name, String email, String userType){
        super(id,name, email, userType);
    }
    @Override
    public  String getUserType(){
        return "Staff";
    }

}
