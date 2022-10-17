package de.fhws.wermar.prog1.u4.l1;

public class Countdown {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 15; i >= 0; i--) {
            System.out.print(i + " ");
            Thread.sleep(1000);
        }
    }
}
