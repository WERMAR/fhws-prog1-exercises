package de.fhws.wermar.prog1.u3.l6;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Jahreszahl zur Überprüfung an: ");
        int yearInput = scanner.nextInt();

        if ((yearInput % 4) == 0) {
            if ((yearInput % 100) != 0 || ((yearInput % 100) == 0 && (yearInput % 400 == 0))) {
                System.out.println("Das Jahr " + yearInput + " ist ein Schaltjahr");
            }
        } else {
            System.out.println("Das Jahr " + yearInput + " ist kein Schaltjahr");
        }
        scanner.close();
    }
}
