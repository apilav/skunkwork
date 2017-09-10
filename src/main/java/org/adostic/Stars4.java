package org.adostic;

public class Stars4 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i + 1; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2*i+1; j++) {
                char character = (char)((int)'A' + i);
                System.out.print(character);

            }
            System.out.println();
        }
    }
}
