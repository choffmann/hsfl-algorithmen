package de.fuas.algorithms;

import java.util.Random;

public class HelloWorld {

    private static final String WELCOME_TEXT = "Welcome to Algorithmen";
    private static final int ARRAY_LENGTH = 3;

    public static String[] getWelcomeText() {
        String[] stringArray = new String[ARRAY_LENGTH];

        stringArray[0] = WELCOME_TEXT;
        stringArray[1] = newText();
        stringArray[2] = "Hello World!";

        return stringArray;
    }

    private static String newText() {
        Random dice = new Random();
        int dieRoll = dice.nextInt();

        if (dieRoll % 2 == 0) {
            return "Git is great!";
        } else {
            return "Java is great!";
        }
    }
}
