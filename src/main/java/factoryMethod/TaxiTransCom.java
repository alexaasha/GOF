package factoryMethod;

public class TaxiTransCom extends TransportCompany{
    public TaxiTransCom(String name) {
        super(name);
    }

    @Override
    public TransportService Create(String n, int c) {
        return new TaxiService(getName(),
                c,
                false);
    }
}