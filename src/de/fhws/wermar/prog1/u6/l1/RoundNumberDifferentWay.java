package de.fhws.wermar.prog1.u6.l1;

import java.util.Scanner;

public class RoundNumberDifferentWay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Eingabe der Zahl: ");
        double eingabeBenutzerNummer = scanner.nextDouble();
        System.out.print("Anzahl Nachkommastellen: "); // ln -> \n -> zunächst einen Zeilenumbruch dann scanner.nextInt()
        int anzahlNachkommastellen = scanner.nextInt();
        System.out.println("Zahl ( " + eingabeBenutzerNummer + " ) ist gerundent: " + runden(eingabeBenutzerNummer, anzahlNachkommastellen));
        scanner.close();
        */
        scanner.close();
        System.out.println("Gerundet: " + rundenA(5.2));
        System.out.println("Gerundet: " + rundenA(5.4));
        System.out.println("Gerundet: " + rundenA(5.6));
        System.out.println("Gerundet: " + rundenA(5.6));
    }

    /**
     * Method for Task a of L1 - returns a rounded number.
     *
     * @param number - which should be rounded
     * @return rounded number based on the lower number without any floating-digits
     */
    public static int rundenA(double number) {
        double neueZahl = number + 0.5;
        return (int) neueZahl;
    }

    public static double runden(double benutzerZahl, int nachkommastellen) {
        int ergebnisPotenz = (int) getNachkommastelle(benutzerZahl, nachkommastellen);
        int indikatorRunden = ergebnisPotenz % 10;
        int zuRundendeZahl = (ergebnisPotenz / 10) % 10;
        zuRundendeZahl = indikatorRunden < 5 ? zuRundendeZahl : zuRundendeZahl + 1;
        return convertToKommaNumber(((ergebnisPotenz / 100 * 10 + zuRundendeZahl)), nachkommastellen - 1);
    }


    public static double getNachkommastelle(double benutzerZahl, int nachkommastellen) {
        var summary = benutzerZahl;
        for (int i = 1; i <= nachkommastellen; i++) {
            summary *= 10;
        }
        return summary;
    }

    public static double convertToKommaNumber(int base, int nachkommastellen) {
        double summary = base;
        for (int i = 1; i <= nachkommastellen; i++) {
            summary /= 10;
        }
        return summary;
    }
}