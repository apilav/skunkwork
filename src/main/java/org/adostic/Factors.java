package org.adostic;

public class Factors {
    public static void main(String[] args) {
        int n = 72;

        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                    break;
                }

            }
        }
    }
}
