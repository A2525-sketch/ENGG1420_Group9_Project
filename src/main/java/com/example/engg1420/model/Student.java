package com.example.engg1420.model;
//child of user
public class Student extends User {
    public Student(String id, String name, String email, String userType){
        super(id,name,email,userType);
    }
    @Override
            public  String getUserType(){
        return "Student";
    }

}
