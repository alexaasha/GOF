package abstractFactory;

import java.io.PrintStream;

public class Client {
    private final AbstractCar abstractCar;
    private final AbstractEngine abstractEngine;

    public Client(CarFactory car_factory) {
        abstractCar = car_factory.CreateCar();
        abstractEngine = car_factory.CreateEngine();
    }

    public int runMaxSpeed() {
        return abstractCar.MaxSpeed(abstractEngine);
    }

    public AbstractCar getAbstractCar() {
        return abstractCar;
    }

    public AbstractEngine getAbstractEngine() {
        return abstractEngine;
    }
}
