package de.fhws.wermar.prog1.u4.l4;

import java.util.Scanner;

public class Querprodukt {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        boolean numberIsValid = false;
        int userInput = -1;
        while (!numberIsValid) {
            System.out.print("Geben Sie bitte eine Zahl ein: ");
            int input = scanner.nextInt();
            if (input < 0 || input >= 1000000)
                System.out.println("Eingabe ist ungültig - Zahl muss positiv sein");
            numberIsValid = !(input < 0 || input >= 1000000);
            if (numberIsValid)
                userInput = input;
        }

        var userInputAsChar = String.valueOf(userInput).toCharArray();
        var sum = 1;
        for (char c : userInputAsChar) {
            sum *= Integer.parseInt(String.valueOf(c));
        }
        System.out.println("Summe der Multiplikation ist: " + sum);
        scanner.close();
    }
}
