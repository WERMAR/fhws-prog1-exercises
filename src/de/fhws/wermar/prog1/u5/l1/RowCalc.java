package de.fhws.wermar.prog1.u5.l1;

public class RowCalc {

    public static void main(String[] args) {
        int k = 1;
        double sum = 0;
        boolean keepForward = true;
        while (keepForward) {
            double newSum = reiheCalc(k, sum);
            if ((newSum - sum) < Math.pow(10, -5)) {
                keepForward = false;
            }
            sum = newSum;
            System.out.println("Summe: " + sum + " bei Durchlauf " + k);
            k++;
        }
        System.out.println("Summe multipliziert mit 6 am Ende: " + (sum * 6));
    }

    /**
     * Bei der Multiplikation mit 6 erhöht sich die Anzahl an durchläufen nahezu quadratisch
     */
    private static double reiheCalc(int k, double sum) {
        return sum += (1 / (Math.pow(k, 2)));
    }
}
