package org.adostic;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Godina je prestupna");
        } else {
            System.out.println("Godina nije prestupna");
        }
    }
}
