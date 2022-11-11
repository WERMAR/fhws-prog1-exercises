package de.fhws.wermar.prog1.u5.l5;

import java.util.Scanner;

public class PiCalc {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Wie viel Rechtecke sollen zur Ermittlung verwendet werden: ");
        var numberOfRectangles = scanner.nextInt();
        var y = 1.0 / numberOfRectangles;
        var pi4 = y;
        for (int i = 1; i < numberOfRectangles; i++) {
            pi4 += y * Math.sqrt(1 - Math.pow((i * y), 2));
        }
        System.out.println("PI: " + (pi4 * 4));
    }
}
