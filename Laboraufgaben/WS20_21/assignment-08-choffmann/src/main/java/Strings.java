
public class Strings {

    private static final int LENGTH_ASCII = 128;

    static boolean containsDuplicates(final String str) {
        boolean found = false;
        for (int i = 0; i < str.length() - 1 && !found; i++) {
            for (int j = i; j < str.length() - 1 && !found; j++) {
                if (str.charAt(i) == str.charAt(j + 1)) {
                    found = true;
                }
            }
        }
        return found;
    }

    static boolean containsDuplicatesOptimized(final String str) {
        boolean[] ascii = new boolean[LENGTH_ASCII];
        boolean found = false;
        for (int i = 0; i < str.length() && !found; i++) {
            int charIndex = (int) str.charAt(i);
            if (!ascii[charIndex]) {
                ascii[charIndex] = true;
            } else {
                found = true;
            }
        }
        return found;
    }

    static String lcsDyn(final String s1, final String s2) {
        String[][] a = new String[s1.length()][s2.length()];
        return lcsDyn(a, 0, s1, 0, s2);
    }

    private static String lcsDyn(final String[][] a, final int i1, final String s1, final int i2, final String s2) {
        if (i1 >= s1.length() || i2 >= s2.length()) {
            return "";
        } else {
            if (a[i1][i2] == null) {
                char c1 = s1.charAt(i1);
                char c2 = s2.charAt(i2);
                if (c1 == c2) {
                    a[i1][i2] = c1 + lcsDyn(a, i1 + 1, s1, i2 + 1, s2);
                } else {
                    String without1 = lcsDyn(a, i1 + 1, s1, i2, s2);
                    String without2 = lcsDyn(a, i1, s1, i2 + 1, s2);
                    if (without1.length() > without2.length()) {
                        a[i1][i2] = without1;
                    } else {
                        a[i1][i2] = without2;
                    }
                }
            }
            return a[i1][i2];
        }
    }
}
