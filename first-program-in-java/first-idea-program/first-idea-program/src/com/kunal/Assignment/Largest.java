package com.kunal.Assignment;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("larger Number between " + num1 + " and " + num2 + " is: ") ;
        if(num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
