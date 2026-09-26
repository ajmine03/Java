package com.mycompany.lab_02;

public class LargestNumb {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("a is the largest");
        } else if (c > b && c > a) {
            System.out.println("c is the largest");
        } else {
            System.out.println("b is the largest");
        }
    }

}
