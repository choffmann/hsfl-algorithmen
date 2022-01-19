import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Measure {

    static <T> void measure(Supplier<T> supplier) {
        long startTime = System.nanoTime();
        supplier.get();
        long endTime = System.nanoTime();
        long difference = endTime - startTime;
        System.out.println(" Ausführung dauerte " + TimeUnit.NANOSECONDS.toMillis(difference) + "ms");
    }

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        SLList<String> sllist = new SLList<>();

        System.out.println("Objektmethode contains für SLList");
        measure(() -> sllist.contains("b"));
        System.out.println("Objektmethode contains für ArrayList");
        measure(() -> arraylist.contains("b"));
        System.out.println("Statische Methode contains für SLList");
        measure(() -> Lists.contains(sllist, "b"));
        System.out.println("Statische Methode contains für ArrayList");
        measure(() -> Lists.contains(arraylist, "b"));
    }
}
