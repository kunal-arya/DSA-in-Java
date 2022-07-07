package com.kunal.asssignments.basic;

import java.util.Scanner;

public class volumeSquarePrism {
    public static void main(String[] args) {
        // Area of Square Prism = area of square * area of height
        Scanner in = new Scanner(System.in);
        System.out.print("Width of the Prism: ");
        int width = in.nextInt();
        System.out.print("height of the Prism: ");
        int height = in.nextInt();
        int area = (width * width ) * height;
        System.out.println("Area of the Square Prism is: " + area);
    }
}
