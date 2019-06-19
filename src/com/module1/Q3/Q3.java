package com.module1.Q3;

//Write a program to print the fibonacci series starting from 1. (1, 2, 3, 5, 8, 13, ...)

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Length of Fibionacci Series: ");
        int l = s.nextInt();
        int a=0;
        int b = 1;
        int c = 0;
        for(int i=0;i<l;i++){
            c= b+a;
            System.out.print(c+",\t");
            a = b;
            b = c;
        }
        s.close();
    }
}
