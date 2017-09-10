package org.adostic;

public class MaxElement {
    public static void main(String[] args) {
        int[] a = {6, 17, 2, 3, 9, 114, 22, 97, 56, 32, 65, 100, 46, 87, 26, 35, 98, 62, 55};

        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println((index + 1));
    }
}
