package javacollectionsandstreams.exceptions.exceptionhandling;

public class InterestCalculation {

    static double calculateInterest(double amt, double rate, int yrs) throws IllegalArgumentException {
        if (amt < 0 || rate < 0) throw new IllegalArgumentException();
        return amt * rate * yrs / 100;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculateInterest(-10000, 5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}

