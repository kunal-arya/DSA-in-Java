package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int power = in.nextInt();
        int ans = 1;
        while(power > 0){
            ans = ans * num;
            power--;
        }
        System.out.println(ans);
    }
}
