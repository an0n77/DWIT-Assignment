package com.module1.Q2;

import java.util.Scanner;

// Write a program to take complete information of a person (name, age, address, hobby, goals) and display them later.
public class Q2 {
    public static void main(String[] args) {
        Details d = new Details();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        d.setName(s.nextLine());
        System.out.println("Enter Age:");
        d.setAge(s.nextInt());
        s.nextLine();
        System.out.println("Enter Address:");
        d.setAddress(s.nextLine());
        System.out.println("Enter Hobby:");
        d.setHobby(s.nextLine());
        System.out.println("Enter Goals:");
        d.setGoals(s.nextLine());

        System.out.println("Name: "+d.getName()+"\tAge: "+d.getAge()+"\tAddress: "+d.getAddress()+"\nHobby: "
                +d.getHobby()+"\t Goals:"+d.getGoals());

        s.close();
    }
}
