package abstractFactory;

public abstract class AbstractCar {
    private final String name;
    private final String typeOfBody;

    public AbstractCar(String name, String typeOfBody){
        this.name = name;
        this.typeOfBody = typeOfBody;
    }

    public abstract int MaxSpeed(AbstractEngine engine);

    public String getName() {
        return name;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }
}
