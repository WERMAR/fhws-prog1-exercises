package de.fhws.wermar.prog1.u6.l6;

public class Jumps {

    public static void main(String[] args) {
        System.out.println(jumps(4, 2, 1, 0));
    }

    public static int jumps(int total, int x1, int x2, int counter) {
        if (total >= x1) {
            counter = jumps(total - x1, x1, x2, counter);
        }
        if (total >= x2) {
            counter = jumps(total - x2, x1, x2, counter);
        }
        if (total == 0)
            counter++;
        return counter;
    }
}
