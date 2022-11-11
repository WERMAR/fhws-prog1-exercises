package de.fhws.wermar.prog1.u5.l2;

import java.util.Scanner;

public class PowCalc {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Basis: ");
        var base = scanner.nextDouble();
        System.out.print("Exponent: ");
        var expo = scanner.nextInt();

        if (expo == 0) {
            System.out.println("Ergebnis: " + 1);
        } else if (expo < 0) {
            System.out.println("Ergebnis: " + calculateNegative(base, expo));
        } else {
            System.out.println("Ergebnis: " + calculatePositive(base, expo));
        }
    }

    public static double calculatePositive(double base, int expo) {
        var multiplicationSummary = 1;
        for (int i = 1; i <= expo; i++) {
            multiplicationSummary *= base;
        }
        return multiplicationSummary;
    }

    private static double calculateNegative(double base, int expo) {
        var multiplicationSummary = 1;
        for (int i = 1; i <= (expo * -1); i++) {
            multiplicationSummary *= base;
        }
        return (1.0 / multiplicationSummary);
    }
}
