package de.fuas.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class StringsTest {

    @Test
    public void testNoDuplicates() {
        Assert.assertFalse(Strings.containsDuplicates(""));
        Assert.assertFalse(Strings.containsDuplicates("a"));
        Assert.assertFalse(Strings.containsDuplicates("abcdefg"));
    }

    @Test
    public void testDuplicates() {
        Assert.assertTrue(Strings.containsDuplicates("abcdefga"));
        Assert.assertTrue(Strings.containsDuplicates("abbcdefg"));
        Assert.assertTrue(Strings.containsDuplicates("abcdefag"));
    }
}
