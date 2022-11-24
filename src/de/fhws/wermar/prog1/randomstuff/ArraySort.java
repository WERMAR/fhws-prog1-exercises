package de.fhws.wermar.prog1.randomstuff;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {42, 3, 120, -57, 740, 13, 9, 230, 2};
        int[] arr2 = {-23, -23, -2, -34, -3, -121, -9, -230, -2};
        System.out.println("Das Maximum ist: " + findMax(arr));
        System.out.println("Das Maximum ist: " + findMax(arr2));
    }

    private static int findMax(int[] arr) {
        int maximum = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > maximum)
                maximum = arr[j];
        }
        return maximum;
    }
}
