
public class Main {

    static final int MEASURE_SIZE = 100000;

    public static void main(final String[] args) {
        ArrayList<String> arrayListContains = new ArrayList<>(MEASURE_SIZE);
        arrayListContains.add(MEASURE_SIZE - 1, "b");

        SLList<String> slListContains = new SLList<>();
        for (int i = 0; i < MEASURE_SIZE; i++) {
            if (i == MEASURE_SIZE - 1) {
                slListContains.add(i, "b");
            }
            slListContains.add(i, null);
        }

        System.out.println("Objektmethode contains für SLList");
        Measure.measure(() -> slListContains.contains("b")); // 2ms
        System.out.println("Objektmethode contains für ArrayList");
        Measure.measure(() -> arrayListContains.contains("b")); // 0ms
        System.out.println("Statische Methode contains für SLList");
        Measure.measure(() -> Lists.contains(slListContains, "b")); // 15875ms
        System.out.println("Statische Methode contains für ArrayList");
        Measure.measure(() -> Lists.contains(arrayListContains, "b")); // 0ms

        ArrayList<String> arrayListAdd = new ArrayList<>();
        SLList<String> slListAdd = new SLList<>();

        System.out.println("Statische Methode add für SLList");
        Measure.measure(() -> Lists.add(slListAdd, "b")); // 3ms
        System.out.println("Statische Methode add für ArrayList");
        Measure.measure(() -> Lists.add(arrayListAdd, "b")); // 17847ms
    }
}
