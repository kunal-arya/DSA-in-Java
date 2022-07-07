package com.kunal.asssignments.basic;

import java.util.Scanner;

public class printSum {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the sum of all numbers
        Scanner input = new Scanner(System.in);
        int totalSum = 0;
        while(true){
            int num = input.nextInt();
            if(num == 0){
                System.out.println(totalSum);
                break;
            }
            totalSum += num;
        }
    }
}
