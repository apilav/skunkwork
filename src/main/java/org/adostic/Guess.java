package org.adostic;

import java.util.Scanner;

public class Guess {
    //Write a guessing game where the user has to guess a secret number.
    //After every guess the program tells the user whether their number was too large or too small.

    //At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 12;
        System.out.println("Unesi broj");
        int number = input.nextInt();
        int pokusaj = 1;
        while (n != number) {
            if (n < number) {
                System.out.println("Broj je prevelik");
            } else if (n > number) {
                System.out.println("Broj je premali");
            }
            System.out.println("Unesi opet broj");
            int num = input.nextInt();
            if (number != num){
                pokusaj++;
            }
            number = num;

        }
        System.out.println("Bravo, trebalo je "+pokusaj+" pokusaja");
    }
}
