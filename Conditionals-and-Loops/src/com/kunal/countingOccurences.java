package com.kunal;


public class countingOccurences {
    public static void main(String[] args) {
        int n = 1385757879;
        int findN = 7;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == findN){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
