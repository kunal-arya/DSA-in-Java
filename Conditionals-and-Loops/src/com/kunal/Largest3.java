package com.kunal;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args){
        // To take user Input
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // one Approach
//        if(a > b && a > c){
//            System.out.println(a + " is the largest");
//        } else if(b > a && b > c){
//            System.out.println(b + " is the largest");
//        } else if(c > a && c > b){
//            System.out.println(c + " is the largest");
//        }

        // Second Approach
        int max = a;

        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        System.out.println(max + " is the largest");
    }
}
