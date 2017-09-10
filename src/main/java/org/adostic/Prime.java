package org.adostic;

public class Prime {
    //Write a program that prints all prime numbers.
    // (Note: if your programming language does not support arbitrary size numbers,
    // printing all primes up to the largest number you can easily represent is fine too.)
    public static void main(String[] args) {

        int N = Integer.MAX_VALUE;


        for (int n = 2; n < N ; n++) {
            boolean prost = true;
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    prost = false;

                }
            }
            if (prost) {
                System.out.println(n);
            }
        }


    }
}
