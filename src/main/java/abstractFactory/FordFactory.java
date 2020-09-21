package abstractFactory;

public class FordFactory extends CarFactory {
    @Override
    public AbstractCar CreateCar() {
        return new FordCar("Ford", "Crossover");
    }

    @Override
    public AbstractEngine CreateEngine() {
        return new FordEngine();
    }
}

