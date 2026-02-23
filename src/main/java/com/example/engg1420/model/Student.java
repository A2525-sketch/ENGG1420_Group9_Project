package com.example.engg1420.model;
//child of user
public class Student extends User {
    public Student(String id, String name){
        super(id,name);
    }
    @Override
            public  String getUserType(){
        return "Student";
    }

}
