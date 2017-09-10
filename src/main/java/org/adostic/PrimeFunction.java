package org.adostic;

public class PrimeFunction {
    public static void main(String[] args) {
        int n = 17;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        boolean prost = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prost = false;
                break;
            }
        }
        return prost;
    }
}
