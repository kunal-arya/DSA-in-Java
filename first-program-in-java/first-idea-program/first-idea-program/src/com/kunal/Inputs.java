package com.kunal;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your Roll Number: ");
//        int rollNo = input.nextInt();
//        System.out.println("Your Roll Number is " + rollNo);

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
