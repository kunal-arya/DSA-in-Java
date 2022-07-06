package com.kunal.Assignment;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args){
        // To take input from the user
        Scanner in = new Scanner(System.in);

        int principal = in.nextInt();
        float rate = in.nextFloat();
        int time = in.nextInt();

        int simpleInterest = (int)((principal * rate * time) / 100);
        System.out.println(simpleInterest);
    }
}
