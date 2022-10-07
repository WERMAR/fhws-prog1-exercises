package de.fhws.wermar.prog1.u3.l2;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author wermar
 */
public class PizzaCalculator {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var diameters = new int[10];
        var priceOfPizza = new double[diameters.length];
        var sizePriceRatio = new double[diameters.length];

        Arrays.fill(sizePriceRatio, -1.0);

        System.out.println("Sie können nun max. 10 Pizzen vergleichen.");
        for (int i = 0; i < diameters.length; i++) {
            System.out.print("Tragen Sie zunächst die Größe der Pizza ein: ");
            diameters[i] = scanner.nextInt();
            System.out.print("Tragen Sie nun den Preis der Pizza ein: ");
            priceOfPizza[i] = scanner.nextDouble();
            System.out.print("Weitere Eingabe? (Y/N) ");
            var userDecisionForward = scanner.next();
            if (userDecisionForward.length() == 1) {
                i = userDecisionForward.toUpperCase().charAt(0) == 'Y' ? i : 10;
                if (i < 10) {
                    System.out.println("Noch " + (10 - (i + 1)) + " von 10 übrig");
                }
            }
        }
        scanner.close();

        for (int i = 0; i < sizePriceRatio.length; i++) {
            if (priceOfPizza[i] != 0)
                sizePriceRatio[i] = diameters[i] / priceOfPizza[i];
        }

        double bestSizePriceRatio = Arrays.stream(sizePriceRatio).max().getAsDouble();
        var bestSizePriceRatioIndex = -1;
        for (int i = 0; i < sizePriceRatio.length; i++) {
            if (sizePriceRatio[i] == bestSizePriceRatio) {
                bestSizePriceRatioIndex = i;
                break;
            }
        }
        if (bestSizePriceRatioIndex == -1)
            throw new NoSuchElementException("Index not found for 'bestSizePriceRatioIndex'");

        System.out.println("Das Beste Preisleistungverhältnis hat die Größe: " + diameters[bestSizePriceRatioIndex] + " für den Preis: " + priceOfPizza[bestSizePriceRatioIndex]);
    }
}
