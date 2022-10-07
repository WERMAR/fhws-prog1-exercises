package de.fhws.wermar.prog1.u2.l2;

/**
 * @author wermar
 */
public class PQCalculation {

    public static void main(String[] args) {
        var p = 20;
        var q = 10;
        var x1 = calculatePQ(p, q, true);
        var x2 = calculatePQ(p, q, false);
        System.out.println("Solution for x1: " + x1);
        System.out.println("Solution for x2: " + x2);
    }

    public static double calculatePQ(int p, int q, boolean positive) {
        var d = Math.sqrt(Math.pow(p / 2.0, 2) - q);
        return positive ? ((-p / 2.0) + d) : ((-p / 2.0) - d);
    }
}
