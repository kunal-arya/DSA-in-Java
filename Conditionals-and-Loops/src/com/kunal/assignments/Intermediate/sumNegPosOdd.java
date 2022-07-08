package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class sumNegPosOdd {
    public static void main(String[] args) {
        // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive
        // odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        Scanner in = new Scanner(System.in);
        int sumNegative = 0, sumEven = 0, sumOdd = 0;
        while(true){
            int n = in.nextInt();

            if(n == 0){
                System.out.println("Sum of Negative Numbers: " + sumNegative);
                System.out.println("Sum of Positive Even Numbers: " + sumEven);
                System.out.println("Sum of Positive Odd Numbers: " + sumOdd);
                break;
            } else if(n < 0){
                sumNegative += n;
            } else if(n > 0){
                if(n % 2 == 0){
                    sumEven += n;
                } else {
                    sumOdd += n;
                }
            }
        }
    }
}
