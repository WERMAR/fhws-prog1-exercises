package de.fhws.wermar.prog1.u4.l5;

public class EinmalEins {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rechnung für Multiplikator: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
                if (j % 5 == 0) System.out.println();

            }
            System.out.println();
        }
    }
}
