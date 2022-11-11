package de.fhws.wermar.prog1.u6.l2;

import java.util.Scanner;

public class Faculty {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Welche Fakultät soll berechnet werden? - ");
        int userInput = scanner.nextInt();
        System.out.println("Faculty: " + calcFaculty(userInput, userInput));
    }

    public static int calcFaculty(int sum, int prevNumber) {
        var newNumber = prevNumber - 1;
        if (newNumber == 0)
            return sum;
        return calcFaculty((sum *= newNumber), newNumber);
    }
}
