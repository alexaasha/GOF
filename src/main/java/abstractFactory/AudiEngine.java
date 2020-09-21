package abstractFactory;

public class AudiEngine extends AbstractEngine {
    private static final int MAX_SPEED = 270;

    public AudiEngine() {
        max_speed = MAX_SPEED;
    }

    @Override
    public int getMax_speed() {
        return max_speed;
    }
}
