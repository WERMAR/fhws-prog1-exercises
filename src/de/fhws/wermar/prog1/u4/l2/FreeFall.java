package de.fhws.wermar.prog1.u4.l2;

import java.util.Scanner;

public class FreeFall {

    public static void main(String[] args) throws InterruptedException {
        var scanner = new Scanner(System.in);
        System.out.print("Bitte Falldauer in Sekunden eingeben: ");
        int durations = scanner.nextInt();

        for (int i = 0; i < durations; i++) {
            if (i % 5 == 0)
                System.out.println("Weg nach " + (i + 1) + " Sekunden: " + calculateWay(i + 1));

            Thread.sleep(1000);
        }
    }

    private static double calculateWay(int t) {
        return 0.5 * 9.80665 * Math.pow(t, 2);
    }
}
