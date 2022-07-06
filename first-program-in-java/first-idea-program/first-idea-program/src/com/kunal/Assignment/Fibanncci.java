package com.kunal.Assignment;

import java.util.Scanner;

public class Fibanncci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 1 || n == 2){
            System.out.println(n);
            return;
        }

        int n1 = 0, n2 = 1, n3;
        for(int i = 3; i <= n ; i++){
            n3 = n1 + n2;
            if(i == n){
                System.out.println(n3);
                return;
            }
            n1 = n2;
            n2 = n3;
        }
    }
}
