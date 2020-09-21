package factoryMethod;

public abstract class TransportService {
    private final String name;
    private final Boolean drunkDriver;

    public TransportService(String name, Boolean drunkDriver) {
        this.name = name;
        this.drunkDriver = drunkDriver;
    }

    abstract public double CostTransportation(double distance);

    public String getName() {
        return name;
    }

    public Boolean getDrunkDriver() {
        return drunkDriver;
    }
}
