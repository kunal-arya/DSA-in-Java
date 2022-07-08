package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        // Compound Interest Formula: P(1 + r/100)t - P
        Scanner in = new Scanner(System.in);
        // Principle amount
        System.out.print("principle amount: ");
        int principle = in.nextInt();
        System.out.print("Rate: ");
        int rate = in.nextInt();
        System.out.print("Time: ");
        int time = in.nextInt();
        double formula = ( principle * (Math.pow((1 + rate * 0.01f), time))) - principle;
        System.out.println("CompoundInterest " + formula);
    }
}
