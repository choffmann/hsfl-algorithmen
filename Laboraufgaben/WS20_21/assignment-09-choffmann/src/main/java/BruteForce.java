
public class BruteForce {

    public static final int MAX_DIGITS = 10;
    private ATM machine = null;

    public BruteForce(final ATM machine) {
        this.machine = machine;
    }

    public String crack(final int len) {
        return crack("", len);
    }

    private String crack(final String current, final int len) {
        if (machine.check(current)) {
            return current;
        } else {
            String status = null;
            boolean found = false;
            if (current.length() < len) {
                for (int i = 0; i < MAX_DIGITS && !found; i++) {
                    String c1 = crack(current + i, len);
                    if (c1 != null) {
                        found = true;
                        status = c1;
                    }
                }
                return status;
            } else {
                return status;
            }
        }
    }
}
