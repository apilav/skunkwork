package org.adostic;

public class Stars3 {
    public static void main(String[] args) {
        int n = 13;

        for (int i=0; i<n; i++){
            for (int j = n; j >i+1; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
