package de.fhws.wermar.prog1.u6.l2;

import java.util.Scanner;

public class Faculty {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Welche Fakultät soll berechnet werden? ");
        long userInput = scanner.nextInt();
        boolean userInputNegative = userInput < 0;
        long faculty = calcFaculty(userInputNegative ? (-1 * userInput) : userInput);
        System.out.println("Faculty: " + (userInputNegative ? (-1 * faculty) : faculty));
    }

    public static long calcFacultyRecursive(long sum, long prevNumber) {
        var newNumber = prevNumber - 1;
        if (newNumber == 0)
            return sum;
        return calcFacultyRecursive((sum * newNumber), newNumber);
    }

    public static long calcFaculty(long num) {
        long sum = 1;
        for (long i = num; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }
}
