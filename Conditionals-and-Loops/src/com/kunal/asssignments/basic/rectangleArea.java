package com.kunal.asssignments.basic;

import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base of the rectangle: ");
        int base = input.nextInt();
        System.out.println("Height of the rectangle: ");
        int height = input.nextInt();
        int area = base * height;
        System.out.println("area of the rectangle is: " + area);
    }
}
