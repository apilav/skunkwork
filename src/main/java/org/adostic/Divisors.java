package org.adostic;

public class Divisors {
    //Find all divisors of given number.
    public static void main(String[] args) {

        int n = 72;

        for (int i = 1; i < n+1 ; i++) {

            if (n % i == 0){
                System.out.println(i);
            }

        }

    }
}
