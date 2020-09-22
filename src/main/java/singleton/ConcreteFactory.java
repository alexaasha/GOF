package singleton;

import abstractFactory.*;

public class ConcreteFactory extends CarFactory{
    private static ConcreteFactory concreteFactory;

    private ConcreteFactory(){}

    @Override
    public AbstractCar CreateCar() {
        return new AudiCar("A8", "Hatchback");
    }

    @Override
    public AbstractEngine CreateEngine() {
        return new AudiEngine();
    }

    public static ConcreteFactory getConcreteFactory() {
        if (concreteFactory == null)
            concreteFactory = new ConcreteFactory();

        return concreteFactory;
    }
}
