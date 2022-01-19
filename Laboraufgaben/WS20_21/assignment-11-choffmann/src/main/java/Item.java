
public class Item {

    private int value = 0;
    private int weight = 0;

    public Item(final int value, final int weight) {
        this.value = value;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }
}
