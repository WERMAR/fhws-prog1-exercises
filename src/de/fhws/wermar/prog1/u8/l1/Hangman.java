package de.fhws.wermar.prog1.u8.l1;

import java.util.Scanner;

public class Hangman {
    static String[] wordPool = {"Test", "Programmieren", "Java", "Intellij", "Google", "FHWS", "Haus", "Coding", "Auto", "Bugatti"};
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String wordPlay = getWordForGame();
        System.out.println(wordPlay);
        playGame(wordPlay);

        scanner.close();
    }

    private static void playGame(String wordPlay) {
        boolean gameIsFinished = false;
        char[] userInputArray = getDefaultCharArrayForWordLength(wordPlay);
        for (int i = 0; i < wordPlay.length(); i++) {
            System.out.print(userInputArray[i]);
        }
        while (!gameIsFinished) {
            System.out.println();
            userInteraction(userInputArray, wordPlay);

            boolean findUnderscore = false;
            for (char c : userInputArray) {
                if (!findUnderscore)
                    findUnderscore = c == '_';
            }
            gameIsFinished = !findUnderscore;
            for (int i = 0; i < wordPlay.length(); i++) {
                System.out.print(userInputArray[i]);
            }
            System.out.println();
            System.out.println();
        }
    }

    private static void userInteraction(char[] array, String word) {
        System.out.print("Give me a Letter: ");
        String input = scanner.nextLine();
        char inputAsChar = input.charAt(0);
        char toCheck = input.toLowerCase().charAt(0);
        char[] playWorkChar = word.toLowerCase().toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (playWorkChar[i] == toCheck) {
                array[i] = inputAsChar;
            }
        }
    }

    private static char[] getDefaultCharArrayForWordLength(String wordPlay) {
        char[] defaultChar = new char[wordPlay.length()];
        for (int i = 0; i < wordPlay.length(); i++) {
            defaultChar[i] = '_';
        }
        return defaultChar;
    }

    private static String getWordForGame() {
        int random = (int) (Math.random() * wordPool.length + 1);
        return wordPool[random - 1];
    }

}
