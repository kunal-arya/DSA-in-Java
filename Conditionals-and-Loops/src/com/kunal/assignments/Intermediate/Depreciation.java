package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Diminishing Balance Method = ( Cost of an Asset * Rate of Depreciation ) / 100
        System.out.print("Cost of an Asset: ");
        int cost = in.nextInt();
        System.out.print("Rate of depreciation: ");
        int depreciation = in.nextInt();
        double formula = (cost * depreciation) * 0.01f;
        System.out.println("Depreciation: " + formula);
    }
}
