package com.module1.Q10;

import java.util.Scanner;

/*
Write a program to take 10 integers value from users, store them in an array, compute the largest and
display the value and position of the largest integer value.
*/
public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter Number:");
            a[i]=s.nextInt();
        }
        int num = a[0];
        int pos = 0;

        for(int i =0;i<10;i++){
                if(num<a[i]){
                    num = a[i];
                    pos = i;
                }

            }
        System.out.println("Largest: "+num+"\t\tPosition: "+pos);
        }

    }

