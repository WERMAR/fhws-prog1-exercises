package de.fhws.wermar.prog1.u5.l4;

import java.util.Scanner;

public class SQRTOwn {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Zahl aus der die Wurzel gezogen wird: ");
        var inputFromUser = scanner.nextDouble();

        var recursion = recursion(inputFromUser, inputFromUser / 2.0, -15);
        var ten = sqrtOwn(inputFromUser, inputFromUser / 2.0, 5);
        var hundred = sqrtOwn(inputFromUser, inputFromUser / 2.0, 100);
        var thousand = sqrtOwn(inputFromUser, inputFromUser / 2.0, 1000);
        var tenThousand = sqrtOwn(inputFromUser, inputFromUser / 2.0, 10000);

        System.out.println("In my opinion best way: \t\t" + recursion);
        System.out.println("Duration Ten: \t\t\t\t\t" + ten);
        System.out.println("Duration Hundred: \t\t\t\t" + hundred);
        System.out.println("Duration Thousand: \t\t\t\t" + thousand);
        System.out.println("Duration Ten Thousand: \t\t\t" + tenThousand);
        System.out.println("Math-SQRT: \t\t\t\t\t\t" + Math.sqrt(inputFromUser));
    }

    private static double recursion(double x, double y, int precision) {
        double v = x / y - y;
        v = v < 0 ? v * -1 : v;
        if (v < Math.pow(10, precision)) {
            return y;
        }
        return recursion(x, (((x / y) + y) / 2), precision);
    }

    private static double sqrtOwn(double x, double y, int duration) {
        for (int i = 0; i < duration; i++) {
            y = (((x / y) + y) / 2);
        }
        return y;
    }
}
