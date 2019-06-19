package com.module1.Q8;

/*
Write a program that finds the sum of two, three and four numbers using method overloading.
Here we have three methods with the same name add(), which means we are overloading this method.
Based on the number of arguments we pass while calling add method will determine which method will be invoked.
*/

public class Q8 {
    public static void main(String[] args) {
        Q8 q1 = new Q8();
        int s1 = q1.add(1,2,7);
        int s2 = q1.add(1,2);
        int s3 = q1.add(2,4,7,8);
        System.out.println(s1+"\n"+s2+"\n"+s3);
    }

    int add(int a, int b){
        return(a+b);
    }

    int add(int a,int b,int c){
        return (a+b+c);
    }

    int add(int a,int b,int c,int d){
        return(a+b+c+d);
    }
}
