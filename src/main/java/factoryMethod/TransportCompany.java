package factoryMethod;

public abstract class TransportCompany {
    private final String name;

    public TransportCompany(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    abstract public TransportService Create(String n, int k);

    public String getName() {
        return name;
    }
}
