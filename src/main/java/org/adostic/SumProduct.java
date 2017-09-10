package org.adostic;

import java.util.Scanner;

public class SumProduct {
    //    Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.
    public static void main(String[] args) {
        System.out.println("Unesi n: ");
        Scanner scanner = new Scanner(System.in);
        int brojClanova;
        brojClanova = scanner.nextInt();

        System.out.println("S ili P");
        String odluka = scanner.next();
        if (odluka.equals("S")) {

            int suma = 0;
            for (int i = 1; i <= brojClanova; i++) {
                suma = suma + i;
            }
            System.out.println("Suma je " + suma);
        } else if (odluka.equals("P")){
            int prod = 1;
            for (int i = 1; i <= brojClanova; i++) {
                prod = prod * i;
            }
            System.out.println("Produkt je " + prod);
        } else {
            System.out.println("Ne valja");
        }

    }
}
