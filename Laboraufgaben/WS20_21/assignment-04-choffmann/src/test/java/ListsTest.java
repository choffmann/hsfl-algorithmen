import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ListsTest {

    @Test
    public void testContains() {
        SLList<String> list = new SLList<>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "b");

        assertTrue(Lists.contains(list, new String("a")));
        assertTrue(Lists.contains(list, null));
        assertTrue(Lists.contains(list, new String("b")));
        assertFalse(Lists.contains(list, "c"));
    }
}
