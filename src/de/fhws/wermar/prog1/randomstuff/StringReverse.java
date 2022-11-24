package de.fhws.wermar.prog1.randomstuff;

public class StringReverse {

    public static void main(String[] args) {
        String text = "Hello World!";
        System.out.println(reverse(text));
    }

    public static String reverse(String text) {
        char[] textAsChar = text.toCharArray();
        char[] reversedChar = new char[textAsChar.length];
        for (int i = 0; i < textAsChar.length; i++) {
            System.out.print(textAsChar[textAsChar.length - i - 1]);
            reversedChar[reversedChar.length - i - 1] = textAsChar[i];
        }
        System.out.println();
        for (int i = textAsChar.length - 1; i >= 0; i--) {
            System.out.print(textAsChar[i]);
            reversedChar[reversedChar.length - i - 1] = textAsChar[i];
        }

        System.out.println();
        return new String(reversedChar);
    }
}
