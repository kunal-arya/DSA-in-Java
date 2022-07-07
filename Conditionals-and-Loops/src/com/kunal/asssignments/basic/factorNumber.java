package com.kunal.asssignments.basic;

import java.util.Scanner;

public class factorNumber {
    public static void main(String[] args) {
        // factors of 6 : 1,2,3,6;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String result = "";
        for(int i = 1 ; i <= num ; i++){
            if(num % i== 0){
                result += i + " ";
            }
        }
        System.out.println("factors of " + num + ": " + result);
    }
}
