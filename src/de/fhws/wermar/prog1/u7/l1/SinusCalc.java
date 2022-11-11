package de.fhws.wermar.prog1.u7.l1;

import de.fhws.wermar.prog1.u5.l2.PowCalc;

import java.util.Scanner;

public class SinusCalc {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Calc Sinus: ");
        double userInput = scanner.nextDouble();
        System.out.println("Own Solution: " + calcSinus(userInput));
        System.out.println("Math Solution: " + Math.sin(userInput));
        scanner.close();
    }

    private static double calcSinus(double x) {
        double summary = 0.0;
        double tempSum = 1.0;
        for (int k = 0; tempSum > 1E-15 || tempSum < -1E-15; k++) {
            var resultFirstPow = PowCalc.calculatePositive(-1, k);
            var numerators = PowCalc.calculatePositive(x, 2 * k + 1);
            var denominator = calcFaculty((2 * k + 1));
            tempSum = resultFirstPow * (numerators / denominator);
            summary += tempSum;
        }
        return summary;
    }

    private static double calcFaculty(int numOfFaculty) {
        double summary = 1.0;
        for (int i = numOfFaculty; i > 0; i--) {
            summary *= i;
        }
        return summary;
    }


}
