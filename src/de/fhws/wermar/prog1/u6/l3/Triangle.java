package de.fhws.wermar.prog1.u6.l3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Größe des Baums an: ");
        print(scanner.nextInt());
        scanner.close();
    }

    public static void print(int rows) {
        for (int i = 0; i < rows; i++) {
            int counter = 0;
            for (int j = 0; j < (rows * 2); j++) {
                if (j >= (rows - (i + 1))) {
                    System.out.print('*');
                    counter++;
                }
                System.out.print(' ');
                if (counter == (i + 1)) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
