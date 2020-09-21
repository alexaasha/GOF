package abstractFactory;

class FordEngine extends AbstractEngine {
    private static final int MAX_SPEED = 220;

    public FordEngine() {
        max_speed = MAX_SPEED;
    }

    @Override
    public int getMax_speed() {
        return max_speed;
    }
}
