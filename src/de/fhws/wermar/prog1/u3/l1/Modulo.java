package de.fhws.wermar.prog1.u3.l1;

import java.util.Scanner;

/**
 * @author wermar
 */
public class Modulo {

    /**
     * <strong>Explanation for b</strong><br>
     * <ul>
     *     <li>Modulo-Operator auf negativen Operanden: Macht kein Unterschied</li>
     *     <li>Modulo-Operator auf Kommazahlen: Macht kein Sinn da die Modulo-Rechnung auf
     *     Restwertrechnung sich bezieht und Kommazahlen nicht gibt -> Funktioniert also nicht und macht kein Sinn</li>
     * </ul>
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein mit der Sie rechnen wollen: ");
        var userInput = scanner.nextDouble();

        System.out.println("Die Zahl " + userInput + " ist durch 7 " + (userInput % 7 == 0 ? "" : "nicht ") + "teilbar");
        scanner.close();
    }
}
