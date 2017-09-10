package org.adostic;

public class FifthPower {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            int x = fifthPower(a[i]);
            System.out.println(x);
        }
    }

    private static int fifthPower(int i) {
        System.out.println(i);
        if (i % 2 == 0) {
            return i * i * i * i * i;
        }
        return i * i;
    }
}
