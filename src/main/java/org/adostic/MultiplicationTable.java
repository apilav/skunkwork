package org.adostic;

public class MultiplicationTable {
    //    Write a program that prints a multiplication table for numbers up to 12.
    public static void main(String[] args) {
        int n = 12;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print("----");


            }
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + " | ");

            }
            System.out.println();

        }
    }
}

//
//        System.out.print("+-+-+-+-+-+-+-+-+-+-+\n");
//        System.out.print("| | | | | | | | | | |\n");
//        System.out.print("+-+-+-+-+-+-+-+-+-+-+\n");
//        System.out.print("| | | | | | | | | | |\n");
//        System.out.print("+-+-+-+-+-+-+-+-+-+-+");
