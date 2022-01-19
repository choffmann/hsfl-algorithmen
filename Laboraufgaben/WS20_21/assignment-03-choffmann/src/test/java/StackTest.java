import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTest {

    @Test
    public void testIsEmpty() {
        Stack<Integer> stack = new Stack<Integer>();

        assertTrue(stack.isEmpty());
        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);

        assertEquals((Integer) 2, stack.pop());
        assertEquals((Integer) 1, stack.pop());
    }

    @Test
    public void testPeek() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);

        assertEquals((Integer) 2, stack.peek());
        assertEquals((Integer) 2, stack.peek());
    }

    @Test
    public void testFind() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);

        assertTrue(s.find(1));
        assertFalse(s.find(2));
    }

    @Test
    public void testFindEquals() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(128);

        assertTrue(s.find(128));
    }
}
