
public class Backtracking {
    static int backtrack(final ArrayList<Item> items, final int maxWeight) {
        return backtrack(items, maxWeight, 0);
    }

    private static int backtrack(final ArrayList<Item> items, final int maxWeight, final int index) {
        if (index >= items.size()) {
            return 0;
        } else {
            int i1 = 0;
            int i2 = 0;
            if (items.get(index).getWeight() <= maxWeight) {
                i1 = items.get(index).getValue()+ backtrack(items, maxWeight - items.get(index).getWeight(), index + 1);
            }
            i2 = backtrack(items,  maxWeight, index + 1);
            return Math.max(i1, i2);
        }
    }

}
