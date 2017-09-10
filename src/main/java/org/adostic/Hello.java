package org.adostic;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kako se zoves?");
        String ime = scanner.nextLine();
        System.out.println("Hello " + ime);
    }
}
