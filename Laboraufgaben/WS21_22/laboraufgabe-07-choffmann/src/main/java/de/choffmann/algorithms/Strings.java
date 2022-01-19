package de.choffmann.algorithms;

public class Strings {

    static boolean containsDuplicates(final String str) {
        boolean found = false;
        for (int i = 0; i < str.length() - 1 && !found; i++) {
            for (int j = i + 1; j < str.length() && !found; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    found = true;
                }
            }
        }
        return found;
    }
}