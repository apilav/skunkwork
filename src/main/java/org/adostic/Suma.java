package org.adostic;

import java.util.Scanner;

public class Suma {
    //Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
    public static void main(String[] args) {
        System.out.println("Unesi n: ");
        Scanner scanner = new Scanner(System.in);
        int brojClanova;
        brojClanova = scanner.nextInt();
        int suma = (brojClanova * (brojClanova + 1)) / 2;
        System.out.println("Suma je " + suma);


        suma = 0;

        for (int i = 1; i <= brojClanova; i++){
            suma = suma + i;

        }
        System.out.println("Suma je " + suma);

    }
}
