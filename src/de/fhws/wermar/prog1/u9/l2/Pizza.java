package de.fhws.wermar.prog1.u9.l2;

import java.util.Arrays;

public class Pizza {

    private String name = "";
    private double[] diameter = new double[0];
    private double[] price = new double[0];

    /**
     * @param name     - Name of the Pizza which is displayed
     * @param diameter - full size of the pizza
     * @param price    - amount what a customer has to pay
     */
    public Pizza(String name, double[] diameter, double[] price) {
        this.name = name;
        this.diameter = diameter;
        this.price = price;
    }

    public double priceSizeRation() {
        double currentPriceRatio = -1;
        if (this.diameter != null) {
            for (int i = 0; i < this.diameter.length; i++) {
                double newPriceRatio = (Math.PI * Math.pow(this.diameter[i], 2) / 4) / this.price[i];
                if (currentPriceRatio == -1)
                    currentPriceRatio = newPriceRatio;
                else if (newPriceRatio > currentPriceRatio)
                    currentPriceRatio = newPriceRatio;
            }
        }
        return currentPriceRatio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getDiameters() {
        return diameter;
    }

    public double[] getPrices() {
        return price;
    }

    /**
     * Only when the combination of a diameter with price is existing, a creation of a new Pizza type is allowed
     * <p>
     * If there is no space anymore in the array, the array size will be increment by one
     *
     * @param diameter - size of the pizza
     * @param price    - amount of the pizza
     */
    public void setNewPizzaType(double diameter, double price) {
        int freeIndex = -1;
        for (int i = 0; i < this.diameter.length; i++) {
            if (this.diameter[i] == 0.0) {
                freeIndex = i;
            }
        }

        if (freeIndex != -1) {
            this.diameter[freeIndex] = diameter;
            this.price[freeIndex] = price;
        } else {
            int size = this.diameter.length + 1;
            this.diameter = this.assignArray(this.diameter, size);
            this.price = this.assignArray(this.price, size);
            this.diameter[size - 1] = diameter;
            this.price[size - 1] = price;
        }
    }

    /**
     * copy function of an old array
     *
     * @param oldArr - old array, which should be copied
     * @param size   - new size of the array
     * @return copied array with the new size
     */
    private double[] assignArray(double[] oldArr, int size) {
        double[] newArr = new double[size];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}
