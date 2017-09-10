package org.adostic;

public class OddPositions {
    //Write a function that returns the elements on odd positions in a list.
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = new int[a.length/2];
        print(a);

        for (int i = 1, j = 0;  i < a.length ; i = i + 2, j++) {
            b[j] = a[i] ;

        }
        print(b);
    }

    public static void print(int[] govno){
        for (int i = 0; i < govno.length; i++) {
            System.out.print(" " + govno[i] + ",");

        }
        System.out.println();

    }

}
