import java.util.ArrayList;
import java.util.List;

public class Strings {

    static List<String> substrings(final String str) {
        List<String> list = new ArrayList<>();
        substrings(str, 0, "", list);
        return list;
    }

    static void substrings(final String str, final int i, final String current, final List<String> result) {
        result.add(current);
        if (i < str.length()) {
            substrings(str, i + 1, current + str.charAt(i), result);
            substrings(str, i + 1, current, result);
        }
    }
}
