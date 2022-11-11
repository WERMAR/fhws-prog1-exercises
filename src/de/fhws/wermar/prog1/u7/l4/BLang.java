package de.fhws.wermar.prog1.u7.l4;

import java.util.Scanner;

public class BLang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihren Text ein: ");
        String wort = scanner.nextLine();
        scanner.close();
        spielen(wort);
    }

    public static void spielen(String text) {
        var charArray = text.toCharArray();

        var laenge = 0;
        var k = 0;

        for (char n : charArray) {
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u')
                laenge = laenge + 2;
            laenge++;
        }

        var newArray = new char[laenge];


        for (char c : charArray) {
            newArray[k] = c;
            switch (c) {
                case 'a' -> {
                    newArray[k + 1] = 'b';
                    newArray[k + 2] = 'a';
                    k += 2;
                }
                case 'e' -> {
                    newArray[k + 1] = 'b';
                    newArray[k + 2] = 'e';
                    k += 2;
                }
                case 'i' -> {
                    newArray[k + 1] = 'b';
                    newArray[k + 2] = 'i';
                    k += 2;
                }
                case 'o' -> {
                    newArray[k + 1] = 'b';
                    newArray[k + 2] = 'o';
                    k += 2;
                }
                case 'u' -> {
                    newArray[k + 1] = 'b';
                    newArray[k + 2] = 'u';
                    k += 2;
                }
            }
            k++;
        }
        System.out.println("Übergebene Zeichenfolge: " + text);
        System.out.println("Zurückgelieferte Zeichenfolge: " + String.valueOf(newArray));
    }
}
