package com.module1.Q4;

import java.util.Scanner;

//Write a program to take positive integer value from user, compute whether it is prime or not, and diplay the result.
public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        boolean flag = false;
        if(n>0){
            for(int i=2; i<n/2;i++){
                if(n%i==0){
                    System.out.println("Number is not prime.");
                    flag = true;
                    break;
                }
            }
            if(!flag)
            System.out.println("number is prime");

        }
        else
            System.out.println("Enter number greater than 0.");
    }
}
