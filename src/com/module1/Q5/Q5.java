package com.module1.Q5;

/*
Write a program to check whether the String value entered by user is palindorme or not.
(Do not use builtin method of String class, write you oen method to check palindorme).
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String st = s.nextLine();
        int n = st.length();
        String b = "";
        for(int i=n-1;i>=0;i--){
            b += st.charAt(i);
        }
        if(st.toLowerCase().equals(b.toLowerCase())) {
            System.out.println(st + " is a palindrome");
        }
        else {
            System.out.println(st+" is not a palindrome.");
        }
    }
}
