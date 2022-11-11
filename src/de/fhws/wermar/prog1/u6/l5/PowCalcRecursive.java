package de.fhws.wermar.prog1.u6.l5;

import java.util.Scanner;

public class PowCalcRecursive {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Basis: ");
        var base = scanner.nextDouble();
        System.out.print("Exponent: ");
        var expo = scanner.nextInt();
        var isNegativeExpo = expo < 0;
        double x = calcPow(1, base, (isNegativeExpo ? (expo * -1) : expo));
        System.out.println("Ergebnis: " + (isNegativeExpo ? (1 / x) : x));
        scanner.close();
    }

    public static double calcPow(double sum, double base, int exp) {
        if (exp == 0)
            return sum;
        return calcPow(sum *= base, base, --exp);
    }
}
