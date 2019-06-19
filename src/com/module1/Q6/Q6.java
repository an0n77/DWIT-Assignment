package com.module1.Q6;

import java.util.Scanner;

/*Write a program that calculates the grade of a student based on the marks entered by user in each subject.
  Program prints the grade based on this logic.
        If the average of marks is >= 80 then prints Grade ‘A’
        If the average is <80 and >=60 then prints Grade ‘B’
        If the average is <60 and >=40 then prints Grade ‘C’
        else prints Grade ‘D’*/
public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int tm = 0;
        do {
            System.out.println("Enter Marks: ");
            tm += s.nextInt();
            i++;
        } while (s.hasNextInt());

        int avg = tm / i;
        System.out.println(avg);
        if(avg>=80){
            System.out.println("Grade A");
        }
        else if(avg>=60){
            System.out.println("Grade B");
        }
        else if(avg>=40){
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D");
        }
    }
}
