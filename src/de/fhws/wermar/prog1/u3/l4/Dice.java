package de.fhws.wermar.prog1.u3.l4;

public class Dice {

    public static void main(String[] args) {
        int diceNum = (int) (Math.random() * 6 + 1);
        switch (diceNum) {
            case 1 -> System.out.println("Eins wurde gewürfelt");
            case 2 -> System.out.println("Zwei wurde gewürfelt");
            case 3 -> System.out.println("Drei wurde gewürfelt");
            case 4 -> System.out.println("Vier wurde gewürfelt");
            case 5 -> System.out.println("Fünf wurde gewürfelt");
            case 6 -> System.out.println("Sechs wurde gewürfelt");
        }
    }
}
