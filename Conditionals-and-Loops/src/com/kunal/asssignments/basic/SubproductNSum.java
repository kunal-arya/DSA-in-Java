package com.kunal.asssignments.basic;

public class SubproductNSum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n = n / 10;
        }
        int result = product - sum;
        return result;
    }
}
