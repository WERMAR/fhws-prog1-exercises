package de.fhws.wermar.prog1.u7.l2;

import java.util.Arrays;
import java.util.Scanner;

public class Arithemetisch {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Anzahl der einzulesenden Werte: ");
        int anzahl = scanner.nextInt();
        if (anzahl <= 0) {
            scanner.close();
            throw new RuntimeException("Wrong Input - Program is not be able to proceed");
        }
        double[] zahlen = new double[anzahl];
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print((i + 1) + " . Zahl eingeben: ");
            zahlen[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Kleinster Wert: " + Arrays.stream(zahlen).min().getAsDouble());
        System.out.println("Max Wert: " + Arrays.stream(zahlen).max().getAsDouble());
        double average = Arrays.stream(zahlen).average().getAsDouble();
        System.out.println("Mittelwert: " + average);
        System.out.println("Streuung: " + Math.sqrt(average));
    }
}
