package factoryMethod;

public class ShipTransCom extends TransportCompany {
    public ShipTransCom(String name) {
        super(name);
    }

    @Override
    public TransportService Create(String n, int t) {
        return new Shipping(getName(),
                t,
                false);
    }
}
