package de.fhws.wermar.prog1.u7.l6;

public class Lotto {
    public static void main(String[] args) {
        ziehung();
    }

    public static void ziehung() {
        int[] zahlenArray = new int[6];

        for (int i = 0; i < 6; i++) {
            int zahl = (int) (Math.random() * 49 + 1);
            boolean taken = schonVergeben(zahlenArray, zahl);

            if (!taken) {
                zahlenArray[i] = zahl;
            } else {
                taken = false;
                i--;
            }
        }
        sortieren(zahlenArray);
        displayZahlen(zahlenArray);
    }

    public static boolean schonVergeben(int[] zahlenArray, int zahl) {
        boolean taken = false;

        for (int j : zahlenArray) {
            if (j == zahl) {
                taken = true;
                break;
            }
        }
        return taken;
    }

    public static void sortieren(int[] zahlenArray) {
        for (int i = 0; i < zahlenArray.length; i++) {
            for (int c = i + 1; c < zahlenArray.length; c++) {
                if (zahlenArray[i] > zahlenArray[c]) {
                    int cache = zahlenArray[i];
                    zahlenArray[i] = zahlenArray[c];
                    zahlenArray[c] = cache;
                }
            }
        }
    }

    public static void displayZahlen(int[] zahlenArray) {
        for (int i = 0; i < zahlenArray.length; i++) {
            System.out.println((i + 1) + ". Zahl: " + zahlenArray[i]);
        }
    }
}
