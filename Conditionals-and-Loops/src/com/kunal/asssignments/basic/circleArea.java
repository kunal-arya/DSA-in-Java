package com.kunal.asssignments.basic;

import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        float pi = 3.14f;
        int area = (int)(pi * (radius * radius ));
        System.out.println("Area of the Circle with radius " + radius + " is: " + area);
    }
}
