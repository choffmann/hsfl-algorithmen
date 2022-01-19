import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringsTest {

    private static final char LAST_ASCII = (char) 127;

    @Test
    public void testNoDuplicates() {
        assertFalse(Strings.containsDuplicates(""));
        assertFalse(Strings.containsDuplicates("a"));
        assertFalse(Strings.containsDuplicates("abcdefg"));
    }

    @Test
    public void testDuplicates() {
        assertTrue(Strings.containsDuplicates("abcdefga"));
        assertTrue(Strings.containsDuplicates("abbcdefg"));
        assertTrue(Strings.containsDuplicates("abcdefag"));
    }

    @Test
    public void testNoDuplicatesFast() {
        assertFalse(Strings.containsDuplicatesOptimized(""));
        assertFalse(Strings.containsDuplicatesOptimized("a"));
        assertFalse(Strings.containsDuplicatesOptimized("abcdefg"));
        assertFalse(Strings.containsDuplicatesOptimized("a" + LAST_ASCII));
    }

    @Test
    public void testDuplicatesFast() {
        assertTrue(Strings.containsDuplicatesOptimized("abcdefga"));
        assertTrue(Strings.containsDuplicatesOptimized("abbcdefg"));
        assertTrue(Strings.containsDuplicatesOptimized("abcdefag"));
        assertTrue(Strings.containsDuplicatesOptimized(LAST_ASCII + "bcdef" + LAST_ASCII));
    }

    @Test
    public void testLcsDyn() {
        assertEquals("tsitest", Strings.lcsDyn("thisisatest", "testing123testing"));
        assertEquals("", Strings.lcsDyn("abcdefg", ""));
        assertEquals("", Strings.lcsDyn("abcdefg", "hijklmno"));
        assertEquals("actagcatagct", Strings.lcsDyn("actagtcatagtaacgt", "actatgcattcgagct"));

        // Hier gibt es 2 mögliche Lösungen, "acd" und "ace"
        assertEquals(3, Strings.lcsDyn("faced", "abcdefg").length());
    }
}
