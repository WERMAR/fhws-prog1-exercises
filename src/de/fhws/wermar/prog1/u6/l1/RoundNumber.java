package de.fhws.wermar.prog1.u6.l1;

import java.util.Scanner;

public class RoundNumber {

    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Zahl fürs Runden eingeben: ");
        var userInput = scanner.nextDouble();
        System.out.print("Anzahl Nachkommastellen: ");
        var numberOfDigitsInput = scanner.nextInt();
        scanner.close();

        System.out.println("Gerundet ist die Eingabe ( " + userInput + " ) = " + getRoundedNumber(userInput, numberOfDigitsInput));
    }

    private static double getRoundedNumber(double userInput, int numberOfDigits) throws Exception {
        String s = String.valueOf(userInput);
        String[] splittedArray = s.split("\\.");
        var chars = splittedArray[1].toCharArray();
        if (numberOfDigits < chars.length) {
            int lastDigitBeforeRound = Integer.parseInt(String.valueOf(chars[numberOfDigits]));
            int numberToRound = Integer.parseInt(String.valueOf(chars[numberOfDigits - 1]));
            numberToRound = lastDigitBeforeRound < 5 ? numberToRound : numberToRound + 1;
            chars[numberOfDigits - 1] = Integer.toString(numberToRound).charAt(0);
            char[] resultChar = new char[numberOfDigits];
            for (int i = 0; i < numberOfDigits; i++) {
                resultChar[i] = chars[i];
            }
            return Double.parseDouble(splittedArray[0] + "." + String.valueOf(resultChar));
        }
        throw new Exception("NumberOfDigits is bigger then number of decimal digits");
    }
}
