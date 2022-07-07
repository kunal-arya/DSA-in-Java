package com.kunal.asssignments.basic;

import java.util.Scanner;

public class sphereVolume {
    public static void main(String[] args) {
        // Volume of Sphere, V = (4/3)πr^3;
        Scanner input = new Scanner(System.in);
        System.out.print("Radius of the Sphere: ");
        int radius = input.nextInt();
        float pi = 3.14f;
        float area = (4 * pi * (radius * radius * radius)) / 3;
        System.out.println("Area of the Sphere: " + area);
    }
}
