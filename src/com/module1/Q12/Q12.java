package com.module1.Q12;
/*
Write a program to take 10 integers value from users, store them in an array, ask the user that whether that array
has to be sorted in ascending or descinding order, sort accordingly and display the sorted result.
*/

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter Number:");
            num[i] = s.nextInt();
        }

        System.out.println("Select Order: \n1 for Ascending \n2 for Descending");
        int order = s.nextInt();

        if(order == 1) {
            for (int i = 0; i < 10; i++) {
                for (int j = i + 1; j < 10; j++) {
                    if (num[i] > num[j]) {
                        num[i] = num[i] ^ num[j];
                        num[j] = num[i] ^ num[j];
                        num[i] = num[i] ^ num[j];
                    }
                }
            }
        }
        else if(order == 2){
            for(int i=0;i<10;i++){
                for(int j=i+1;j<10;j++){
                    if(num[i]<num[j]){
                        num[i] = num[i]^num[j];
                        num[j] = num[i]^num[j];
                        num[i] = num[i]^num[j];
                    }
                }
            }
            }
        else {
            System.out.println("Invalid order.");
        }

        for(int x:num){
            System.out.println(x);
        }



    }
}
