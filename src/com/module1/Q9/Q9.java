package com.module1.Q9;
/*
Write a program that finds the area of square, rectangle and circle using method overloading.
In this program we have three methods with same name area(), which means we are overloading area() method.
By having three different implementation of area method, we are calculating the area of square, rectangle and circle.
*/

public class Q9 {
    public static void main(String[] args) {
        Q9 a1 = new Q9();
        float sq =a1.area(9.3f);
        float rec = a1.area(4f,5f);
        double cir = a1.area(12.7d);
        System.out.println("Area(Square): "+sq+"\nArea(Rectangle): "+rec+"\nArea(Square): "+cir);

    }

    float area(float l){
        return(l*l);
    }
    float area(float l,float b){
        return (l*b);
    }
    double area(double r){
        return(r*r*22/7);
    }
}
