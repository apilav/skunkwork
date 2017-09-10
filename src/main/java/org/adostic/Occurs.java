package org.adostic;

public class Occurs {
    public static void main(String[] args) {
        int[] a = {1, 2, 7, 4, 5, 6, 7, 8, 9};
        int n = 7;
        boolean imaBroja = false;
        int brojac = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                imaBroja = true;
                ++brojac;
            }
        }
        if (imaBroja) {
            System.out.println("Ima " + brojac);
        } else {
            System.out.println("Nema");
        }
    }
}
