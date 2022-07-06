package com.kunal.Assignment;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float rupees = input.nextFloat();
        float dollar = rupees * 0.013f;
        System.out.println("Currency Conversion: ");
        System.out.println("rupee: " + rupees);
        System.out.println("dollar: " + dollar);
    }
}
