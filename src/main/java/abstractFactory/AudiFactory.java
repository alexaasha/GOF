package abstractFactory;

public class AudiFactory extends CarFactory{
    @Override
    public AbstractCar CreateCar() {
        return new AudiCar("Audi", "Sedan");
    }

    @Override
    public AbstractEngine CreateEngine() {
        return new AudiEngine();
    }
}
