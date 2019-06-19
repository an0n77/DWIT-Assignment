package com.module1.Q11;

/*
Write a program to take 10 String value from users and one search text, implement your own method to search
whether the search text is present in that String array or not. If present display the position where it is present in an array.
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] name = new String[10];
        for(int i = 0;i<10;i++){
            System.out.println("Enter name: ");
            name[i] = s.nextLine();
        }
        System.out.println("Enter Name for Searching: ");
        String sString = s.nextLine();
        int pos = 0;
        boolean flag = false;
        for(int i=0;i<10;i++){
            if(sString.toLowerCase().equals(name[i].toLowerCase())){
                System.out.println(sString+" is Present"+" at position "+i);
                flag = true;
            }

        }
        if(!flag){
            System.out.println(sString+" is not present");
        }
    }
}
