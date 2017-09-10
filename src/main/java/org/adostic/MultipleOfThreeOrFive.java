package org.adostic;

import java.util.Scanner;

public class MultipleOfThreeOrFive {
    //Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
    public static void main(String[] args) {
        System.out.println("Unesi n: ");
        Scanner scanner = new Scanner(System.in);
        int brojClanova;
        brojClanova = scanner.nextInt();
        int suma;

        suma = 0;

//        for (int i = 3; i <= brojClanova; i = i + 3) {
//            suma = suma + i;
//        }
//
//        for (int i = 5; i <= brojClanova; i = i + 5) {
//            suma = suma + i;
//        }
        for (int i = 0; i < brojClanova; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma = suma + i;

            }

        }
        System.out.println("Suma je " + suma);

    }
}
