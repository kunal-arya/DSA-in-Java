package com.kunal.Assignment;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
