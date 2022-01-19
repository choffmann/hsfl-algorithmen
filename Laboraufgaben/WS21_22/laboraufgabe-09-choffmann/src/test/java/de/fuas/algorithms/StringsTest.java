package de.fuas.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;
import java.util.List;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class StringsTest {

    @Test
    @Tag("Advanced")
    public void testEmpty() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        Assert.assertTrue("Der leere String ist immer ein Substring", result.contains(""));
    }

    @Test
    @Tag("Advanced")
    public void testWhole() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        Assert.assertTrue("Der String selbst ist immer ein Substring", result.contains(str));
    }

    @Test
    @Tag("Advanced")
    public void testSingles() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        for (int i = 0; i < str.length(); i++) {
            String element = str.charAt(i) + "";
            Assert.assertTrue("In den Substrings sollte der folgende enthalten sein: " + element,
                    result.contains(element));
        }
    }

    @Test
    @Tag("Advanced")
    public void testPairs() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String element = str.charAt(i) + (str.charAt(j) + "");
                Assert.assertTrue("In den Substrings sollte der folgende enthalten sein: " + element,
                        result.contains(element));
            }
        }
    }

    @Test
    @Tag("Advanced")
    public void testTriples() {
        String str = "abcd";
        List<String> result = Strings.substrings(str);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    String element = str.charAt(i) + (str.charAt(j) + (str.charAt(k) + ""));
                    Assert.assertTrue("In den Substrings sollte der folgende enthalten sein: " + element,
                            result.contains(element));
                }
            }
        }
    }
}
