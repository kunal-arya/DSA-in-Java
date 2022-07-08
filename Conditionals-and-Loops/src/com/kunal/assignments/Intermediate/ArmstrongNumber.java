package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int length = (int)(Math.log10(num) + 1);
        int temp = num;
        int armStrong = 0;
        while (temp > 0){
            int rem = temp % 10;
            armStrong += Math.pow(rem,length);
            temp /= 10;
        }
        if(num == armStrong ){
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong" + armStrong + " " + num);
        }
    }
}
