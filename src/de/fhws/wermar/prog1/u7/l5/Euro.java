package de.fhws.wermar.prog1.u7.l5;

public class Euro {

    public static void main(String[] args) {
        System.out.println("Die Wahrscheinlichkeit nach 10.000 zufälligen Durchläufen: " + wahrscheinlichkeit() + " %");
    }

    public static double wahrscheinlichkeit() {
        int anzVersuche = 10000;
        int counter = 0;
        int anzIst = 0;
        while (counter < anzVersuche / 2) {
            int zufallSchublade = (int) Math.round(Math.random() * 3);
            if (zufallSchublade == 3) {
                anzIst++;
            }
            counter++;
        }
        return ((double) anzIst / (anzVersuche / 2.0)) * 100;
    }
}
