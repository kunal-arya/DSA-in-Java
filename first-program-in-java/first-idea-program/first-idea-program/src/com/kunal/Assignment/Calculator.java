package com.kunal.Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number 1: ");
        int num1 = in.nextInt();
        System.out.print("number 2: ");
        int num2 = in.nextInt();
        System.out.print("Choose an operator from ( + , - , * , / ): ");
        char operator = in.next().charAt(0);
        switch (operator){
            case '+':
                int sum = num1 + num2;
                System.out.println("sum of " + num1 + " + " + num2 + " = " + sum);
                break;

            case '-':
                int sub = num1 - num2;
                System.out.println("subtraction of " + num1 + " - " + num2 + " = " + sub);
                break;

            case '*':
                int multiply = num1 * num2;
                System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + multiply);
                break;

            case '/':
                int divide = num1 / num2;
                System.out.println("division of " + num1 + " by " + num2 + " is " + divide);
                break;

            default:
                System.out.println("ERROR! please write appropriate Operator");
                break;
        }
    }
}
