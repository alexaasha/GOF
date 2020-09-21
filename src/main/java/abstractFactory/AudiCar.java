package abstractFactory;

public class AudiCar extends AbstractCar {
    public AudiCar(String name, String typeOfBody) {
        super(name, typeOfBody);
    }

    @Override
    public int MaxSpeed(AbstractEngine engine) {
        return engine.getMax_speed();
    }

    @Override
    public String toString() {
        return getName();
    }
}
