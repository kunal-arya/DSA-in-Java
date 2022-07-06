package com.kunal;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        // To get the input from the keyboard
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input .nextFloat();

        float sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
