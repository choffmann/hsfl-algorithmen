package de.choffmann.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
class HastSetTest {

    @Test
    void testAddNull() {
        HashSet<String> set = new HashSet<>();

        Assert.assertFalse(set.contains(null));

        set.add(null);

        Assert.assertTrue(set.contains(null));
    }

    @Test
    void testDuplicate() {
        HashSet<String> set = new HashSet<>();

        boolean firstAdd = set.add("A");

        Assert.assertTrue(set.contains("A"));
        Assert.assertTrue(firstAdd);

        boolean secondAdd = set.add("A");

        Assert.assertTrue(set.contains("A"));
        Assert.assertFalse(secondAdd);
    }

    @Test
    void testCollision() {
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("Q");

        Assert.assertTrue(set.contains("A"));
        Assert.assertTrue(set.contains("Q"));
    }

    @Test
    void testRehash() {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 14; i++) {
            set.add("" + (65 + i));
        }

        for (int i = 0; i < 14; i++) {
            Assert.assertTrue(set.contains("" + (65 + i)));
        }
    }
}
