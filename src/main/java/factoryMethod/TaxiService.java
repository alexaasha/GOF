package factoryMethod;

public class TaxiService extends TransportService {
    private final int Category;

    public TaxiService(String name, int cat, Boolean drunkDriver){
            super(name, drunkDriver);
            Category = cat;
    }

    @Override
    public double CostTransportation(double distance) {
        return distance * Category;
    }

    @Override
    public String toString() {
        return String.format("%s, category %d",
        getName(), Category);
    }
}