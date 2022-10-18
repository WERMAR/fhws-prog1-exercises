package de.fhws.wermar.prog1.u4.l3;

import java.util.Scanner;

public class Primzahlen {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int numberToCheck = scanner.nextInt();

        if (numberToCheck == 0 || numberToCheck == 1) {
            System.out.println("Die Zahl ist keine Primzahl");
        } else {
            for (int i = 2; i <= numberToCheck; i++) {
                boolean isPrimzahl = true;

                for (int j = 2; j < i && isPrimzahl; j++) {
                    isPrimzahl = !(i % j == 0);
                }
                if (isPrimzahl)
                    System.out.println("Zahl " + i + " ist eine Primzahl");

                if (i == numberToCheck) {
                    if (!isPrimzahl) {
                        System.out.println("Zahl " + i + " ist keine Primzahl");
                    }
                }
            }
        }
        scanner.close();
    }
}
