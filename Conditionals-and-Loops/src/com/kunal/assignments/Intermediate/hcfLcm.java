package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class hcfLcm {
    public static void main(String[] args) {
        int num1, num2, temp1, temp2, temp, hcf, lcm;
        Scanner input = new Scanner(System.in);
        System.out.print("number1: ");
        num1 = input.nextInt();
        System.out.print("number2: ");
        num2 = input.nextInt();
        temp1 = num1;
        temp2 = num2;
        while(temp1 % temp2 != 0){
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }
        hcf = temp2;
        lcm = (num1 * num2) / hcf;
        System.out.println("Hcf: " + hcf);
        System.out.println("Lcm: " + lcm);
    }
}
