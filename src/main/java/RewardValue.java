public class RewardValue {

    private double cashValue;

    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.cashValue = calculateCashValue(milesValue);
    }

    private static double calculateCashValue(int milesValue) {
        return (double) (milesValue * MILES_TO_CASH_RATE);
    }

    private static int calculateMilesValue(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_RATE);
    }

    // Returns the cash value of the RewardValue
    public double getCashValue() {
        return this.cashValue;
    }

    // Returns how many miles the RewardValue is worth
    public int getMilesValue() {
        int milesValue = calculateMilesValue(this.cashValue);
        return milesValue;
    }
}
