package foodzombie.utils;

public enum LootNumbers {
    UNCOMMON(0.1f, 3, 5),
    RARE(0.05f, 2, 4),
    EPIC(0.02f, 1, 3),
    MONEY(1, 10, 30);

    private final float probability;
    private final int minAmount;
    private final int maxAmount;

    LootNumbers(float probability, int minAmount, int maxAmount) {
        this.probability = probability;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public float PROBABILITY() {
        return probability;
    }

    public int MINAMOUNT() {
        return minAmount;
    }

    public int MAXAMOUNT() {
        return maxAmount;
    }
}
