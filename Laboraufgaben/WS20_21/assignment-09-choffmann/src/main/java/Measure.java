import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Measure {
    static <T> T measure(final Supplier<T> supplier) {
        long startTime = System.nanoTime();
        T result = supplier.get();
        long endTime = System.nanoTime();
        long difference = endTime - startTime;
        System.out.println("  Execution took " + TimeUnit.NANOSECONDS.toMillis(difference) + "ms");
        return result;
    }
}
