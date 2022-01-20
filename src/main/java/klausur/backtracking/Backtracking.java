package klausur.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static List<String> addSpaces(String word) {
        List<String> result = new ArrayList<String>();
        addSpaces(word,1, result);
        return result;
    }

    private static void addSpaces(String word, int index, List<String> list) {
        if (index < word.length()) {
            String c1 = word.substring(0, index) + "_" + word.substring(index, word.length());
            addSpaces(word, index + 1, list);
            addSpaces(c1, index + 2, list);
        } else {
            list.add(word);
        }
    }
}