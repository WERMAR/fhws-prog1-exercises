package de.fhws.wermar.prog1.u3.l5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrikelnumberCheck {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie ihre Matrikelnummer ein: ");
        var inputUser = scanner.next();
        scanner.close();

        if (inputUser.length() == 0) {
            System.out.println("No Matrikelnumber available for check - Task finished");
        }
    }
}
