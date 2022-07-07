package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int factorial = 1;
        // because 0! is 1 and 1! is also 1
        if(num == 0 || num == 1){
            System.out.println("Factorial value of " + num + " is: " + factorial);
            return;
        }

        for(int i = 1; i <=num ; i++ ){
            factorial *= i;
        }
        System.out.println("Factorial value of " + num + " is: " + factorial);
    }
}
