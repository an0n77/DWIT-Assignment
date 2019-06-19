package com.module1.Q1;

/*  Write a program to take two numbers (floating numbers) as input from users and display which one
 is the largest and which one is the smallest. */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        float a,b = 0f;
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();

        if(a>b){
            System.out.println("Largest: "+a+"\tSmallest: "+b);
        }
        else{
            System.out.println("Largest: "+b+"\tSmallest: "+a);
        }
        s.close();
    }
}
