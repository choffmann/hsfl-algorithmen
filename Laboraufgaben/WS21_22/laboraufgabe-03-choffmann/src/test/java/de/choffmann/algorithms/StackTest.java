package de.choffmann.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class StackTest {

    @Test
    public void testIsEmpty() {
        Stack<Integer> stack = new Stack<Integer>();

        Assert.assertTrue(stack.isEmpty());
        stack.push(1);

        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);

        Assert.assertEquals((Integer) 2, stack.pop());
        Assert.assertEquals((Integer) 1, stack.pop());
    }

    @Test
    public void testPeek() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);

        Assert.assertEquals((Integer) 2, stack.peek());
        Assert.assertEquals((Integer) 2, stack.peek());
    }

    @Test
    public void testFind() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);

        Assert.assertTrue(s.find(1));
        Assert.assertFalse(s.find(2));
    }

    @Test
    public void testFindEmpty() {
        Stack<Integer> s = new Stack<Integer>();

        Assert.assertFalse(s.find(1));
    }

    @Test
    @Tag("Advanced")
    public void testFindNoMutation() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);

        Assert.assertTrue(s.find(1));
        Assert.assertTrue(s.find(1));
    }

    @Test
    @Tag("Advanced")
    public void testFindEquals() {
        Stack<String> s = new Stack<String>();
        s.push(new String("a"));

        Assert.assertTrue(s.find(new String("a")));
    }
}