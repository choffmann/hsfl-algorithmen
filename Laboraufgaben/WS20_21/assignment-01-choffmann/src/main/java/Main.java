
public class Main {

    public static final int LIST_SIZE = 5;
    public static final int LIST_MULTIPLIER = 10;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= LIST_SIZE; i++) {
            list.add(i, i * LIST_MULTIPLIER);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
