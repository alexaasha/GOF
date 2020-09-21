package factoryMethod;

public class Shipping extends TransportService{
    private final double Tariff;

    public Shipping(String name, int taff, Boolean drunkDriver){
            super(name, drunkDriver);
            Tariff = taff;
    }

    @Override
    public double CostTransportation(double distance) {
        return distance * Tariff;
    }

    @Override
    public String toString() {
        return String.format("%s, tariff %f",
        getName(), Tariff);
    }
}
