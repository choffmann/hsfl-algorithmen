import java.util.Random;

public class ATM {
    private static final int NUM_DIGITS = 10;

    private int length;
    private String pin;

    public ATM(final int length) {
        this.length = length;
        this.pin = randomPin();
        System.out.println("The secret pin of the ATM is " + this.pin + "\n");
    }

    private String randomPin() {
        Random r = new Random();
        String pin = "";
        for (int i = 0; i < this.length; i++) {
            pin += r.nextInt(NUM_DIGITS);
        }
        return pin;
    }

    public boolean check(final String input) {
        return this.pin.equals(input);
    }
}
