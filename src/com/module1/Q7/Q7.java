package com.module1.Q7;

/*Write a program to make a simple calculator that performs addition, subtraction, multiplication and division
based on the user input. The program takes the value of both the numbers (entered by user) and then
user is asked to enter the operation (+, -, * and /), based on the input program performs the selected
operation on the entered numbers using switch case.*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        float a = s.nextFloat();
        System.out.println("Enter Number:");
        float b = s.nextFloat();
        s.nextLine();
        System.out.println("Enter Operator:");
        char op = s.nextLine().charAt(0);

        switch(op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
