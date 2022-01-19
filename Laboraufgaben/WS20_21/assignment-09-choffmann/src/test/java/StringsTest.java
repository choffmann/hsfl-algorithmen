import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class StringsTest {

    @Test
    public void testEmpty() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        assertTrue("Should contain the empty string", result.contains(""));
    }

    @Test
    public void testWhole() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        assertTrue("Should contain the whole string", result.contains(str));
    }

    @Test
    public void testSingles() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        for (int i = 0; i < str.length(); i++) {
            String element = str.charAt(i) + "";
            assertTrue("Should contain " + element, result.contains(element));
        }
    }

    @Test
    public void testPairs() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String element = str.charAt(i) + (str.charAt(j) + "");
                assertTrue("Should contain " + element, result.contains(element));
            }
        }
    }

    @Test
    public void testTriples() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    String element = str.charAt(i) + (str.charAt(j) + (str.charAt(k) + ""));
                    assertTrue("Should contain " + element, result.contains(element));
                }
            }
        }
    }
}
