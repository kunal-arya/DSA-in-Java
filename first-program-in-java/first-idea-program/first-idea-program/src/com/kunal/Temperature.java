package com.kunal;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float tempC = in.nextFloat();
        float tempF = (tempC * 1.8f ) + 32;
        System.out.println(tempF);
    }
}
