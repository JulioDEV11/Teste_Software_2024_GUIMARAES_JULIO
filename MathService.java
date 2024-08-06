public class MathService {
    private Multiplier multiplier;

    public void setMultiplier(Multiplier multiplier) {
        this.multiplier = multiplier;
    }

    public int multiply(int a, int b) {
        return multiplier.multiply(a, b);
    }
}
