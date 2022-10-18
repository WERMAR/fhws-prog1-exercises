package de.fhws.wermar.prog1.u3.l5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrikelnumberCheck {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie ihre Matrikelnummer ein: ");
        var inputUser = scanner.next();
        scanner.close();

        if (inputUser.length() != 7) {
            System.err.println("No valid Matrikelnumber available for check - Task finished");
        } else {
            String beginOfMatrikelNum = inputUser.substring(0, 2);
            if (beginOfMatrikelNum.equals("50") || beginOfMatrikelNum.equals("51") || beginOfMatrikelNum.equals("61")) {
                System.out.println("Matrikelnummer is valid");
            } else {
                System.out.println("Matrikelnummer is not valid");
            }
        }
    }
}
