package abstractFactory;

public class FordCar extends AbstractCar {
    public FordCar(String name, String typeOfBody) {
        super(name, typeOfBody);
    }

    @Override
    public int MaxSpeed(AbstractEngine engine) {
        return engine.max_speed;
    }

    @Override
    public String toString() {
        return getName();
    }
}