package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        /*
        0 - 100 = 1.2;
        100-300 = 2;
           >300 = 3;
        */

        Scanner input = new Scanner(System.in);
        int unit = input.nextInt();
        float electricityBill = 0f;
        if(unit < 100 ){
            electricityBill += unit * 1.2f;
        } else if(unit < 300){
            electricityBill = 100 * 1.2f + (unit - 100) * 2;
        } else if(unit >= 300){
            electricityBill = 100 * 1.2f + 200 * 2 + (unit - 300) * 3;
        }

        System.out.println("Your Units are: " + unit + " and your Electricity Bill: " + electricityBill);
    }
}
