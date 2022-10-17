package de.fhws.wermar.prog1.u3.l3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleCharacter {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        boolean nextInput = true;
        while (nextInput) {
            System.out.print("Geben Sie eine Zahl ein: ");
            var userInput = scanner.next();
            checkUserInput(userInput);
            System.out.print("Weitere Eingabe? (Y/N): ");
            nextInput = scanner.next().toUpperCase().charAt(0) == 'Y';
        }
        scanner.close();
    }

    private static void checkUserInput(String userInput) {
        boolean touchedFlag = false;
        if (userInput.length() != 1) {
            throw new InputMismatchException("Input was wrong");
        }

        System.out.println("---------------------");
        System.out.println("Ihre Eingabe kann folgendes Zeichen sein: ");

        char userInputChar = userInput.charAt(0);
        if ((userInputChar >= '0' && userInputChar <= '9') || (userInputChar >= 'a' && (userInputChar <= 'f')) || (userInputChar >= 'A' && userInputChar <= 'F')) {
            System.out.println("\tHexadezimal Zahl");
            touchedFlag = true;
        }

        if (userInputChar >= '0' && userInputChar <= '1') {
            System.out.println("\tBinärzeichen");
        }

        if (userInputChar >= '0' && userInputChar <= '7') {
            System.out.println("\tOktal-Ziffer");
        }

        if (userInputChar >= 'A' && userInputChar <= 'Z') {
            System.out.println("\tGroßbuchstabe");
            touchedFlag = true;
        }

        if (!touchedFlag) {
            System.out.println("Unbekannt");
        }
    }
}
