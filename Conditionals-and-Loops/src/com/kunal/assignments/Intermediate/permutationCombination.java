package com.kunal.assignments.Intermediate;

import java.util.Scanner;

public class permutationCombination {
    static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        int smallAns = factorial(num - 1);
        return num * smallAns;
    }

    public static void main(String[] args) {
        // permutation = n!/(n-r)!
        // combination = n!/[r! (n-r)!]
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n1 = input.nextInt();
        int n = factorial(n1);
        System.out.print("r: ");
        int r1 = input.nextInt();
        int r = factorial(r1);
        int nr = factorial(n1 - r1);
        double permutation = n / nr;
        System.out.print("Permutation: " + permutation);
        System.out.println();
        double combination = n / (r * nr);
        System.out.println("combination: " + combination);
    }
}
