package org.adostic;

public class Stars2 {
    public static void main(String[] args) {
        int n = 3;

        for (int i=0; i<n; i++){
            for (int j = n; j >i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
