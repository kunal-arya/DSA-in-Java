package com.kunal;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 23597;
        int reverse = 0;
        while(n > 0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
