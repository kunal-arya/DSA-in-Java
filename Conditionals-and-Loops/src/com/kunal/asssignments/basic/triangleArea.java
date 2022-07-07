package com.kunal.asssignments.basic;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base of the Triangle: ");
        int base = in.nextInt();
        System.out.print("Height of the Triangle: ");
        int height = in.nextInt();
        int area = (int)(0.5f * base * height);
        System.out.println("Area of the Triangle is: " + area);
    }
}
