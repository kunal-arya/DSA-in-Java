package com.kunal.Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String newStr = "";
        char ch;
        for(int i = 0 ; i < str.length(); i++){
            ch = str.charAt(i);
            newStr = ch + newStr;
        }

        if(str.equals(newStr)){
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}
