package de.fhws.wermar.prog1.u9.l2;

public class Main {

    public static void main(String[] args) {
        double[] defaultDiameters = {28.0, 30.0, 32.0};
        double[] defaultPrice = {6.5, 7.5, 9.5};
        Pizza[] pizza = new Pizza[5];
        pizza[0] = new Pizza("Hawaii", defaultDiameters, defaultPrice);
        pizza[1] = new Pizza("Salami", defaultDiameters, new double[]{6.5, 3.5, 9.5});
        pizza[2] = new Pizza("Ham", defaultDiameters, defaultPrice);
        pizza[3] = new Pizza("BBQ", defaultDiameters, new double[]{8.5, 10.0, 11.5});
        pizza[4] = new Pizza("Nothing", defaultDiameters, defaultPrice);

        Pizza currentPizza = pizza[0];
        for (int i = 1; i < pizza.length; i++) {
            double priceSizeRation = pizza[i].priceSizeRation();
            if (currentPizza != null) {
                currentPizza = currentPizza.priceSizeRation() < priceSizeRation ? pizza[i] : currentPizza;
            }
        }
        if (currentPizza != null)
            System.out.printf("Pizza %s ist die beste Pizza%n", currentPizza.getName());
    }
}
