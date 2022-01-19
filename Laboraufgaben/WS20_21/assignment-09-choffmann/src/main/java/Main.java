public class Main {

    private static final int PIN_LENGTH = 6;

    public static void main(final String[] args) {
        ATM machine = new ATM(PIN_LENGTH);
        BruteForce cracker = new BruteForce(machine);
        System.out.println("Starting to generate all possible pins");
        String pin = Measure.measure(() -> cracker.crack(PIN_LENGTH));
        System.out.println("Found the following pin " + pin);
    }
}
