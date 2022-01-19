import org.junit.Assert;
import org.junit.Test;

public class BacktrackTest {

    @Test
    public void fillKnapsackLast() {
        Item i1 = new Item(60, 10);
        Item i2 = new Item(100, 20);
        Item i3 = new Item(120, 30);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(0, i1);
        items.add(1, i2);
        items.add(2, i3);

        int maxWeight = 50;

        Assert.assertEquals(220, Backtracking.backtrack(items, maxWeight));
    }

    @Test
    public void fillKnapsackFirst() {
        Item i1 = new Item(600, 150);
        Item i2 = new Item(100, 250);
        Item i3 = new Item(500, 1000);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(0, i1);
        items.add(1, i2);
        items.add(2, i3);

        int maxWeight = 700;

        Assert.assertEquals(700, Backtracking.backtrack(items, maxWeight));
    }
}
