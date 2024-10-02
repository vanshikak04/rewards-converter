public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Conversion rate: 1 mile = 0.0035 cash
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor to accept a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE; // Convert cash to miles
    }

    // Constructor to accept a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE; // Convert miles to cash
    }

    // Method to get the cash value of the reward
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value of the reward
    public double getMilesValue() {
        return milesValue;
    }
}