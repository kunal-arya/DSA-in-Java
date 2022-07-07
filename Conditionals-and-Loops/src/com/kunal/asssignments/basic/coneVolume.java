package com.kunal.asssignments.basic;

import java.util.Scanner;

public class coneVolume {
    public static void main(String[] args) {
        //Formula =>  V = (1/3)πr2h cubic units
        Scanner input = new Scanner(System.in);
        System.out.print("Radius of the cone: ");
        int radius = input.nextInt();
        System.out.print("Height of the cone: ");
        int height = input.nextInt();
        float pi = 3.14f;
        float area = (pi * (radius * radius ) * height)/3;
        System.out.println("Area of the Cone: " + area);
    }
}
