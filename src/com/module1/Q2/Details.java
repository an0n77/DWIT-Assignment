package com.module1.Q2;

public class Details {
    private String name;
    private String address;
    private String hobby;
    private String goals;
    private int  age;


    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setAddress(String address){
        this.address = address;
    }
    void setHobby(String hobby){
        this.hobby = hobby;
    }
    void setGoals(String goals){
        this.goals = goals;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getAddress(){
        return address;
    }
    String getHobby(){
        return hobby;
    }
    String getGoals(){
        return goals;
    }
}
