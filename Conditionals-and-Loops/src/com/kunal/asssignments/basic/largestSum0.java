package com.kunal.asssignments.basic;

import java.util.Scanner;

public class largestSum0 {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true){
            int num = in.nextInt();
            if(num == 0){
                System.out.println("Maximum Number among these Number is: " + max);
                break;
            }
            if(num > max){
                max = num;
            }
        }
    }
}
