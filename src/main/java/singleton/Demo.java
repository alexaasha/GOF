package singleton;

import abstractFactory.*;

import java.io.PrintStream;

public class Demo {
    public static void main() {
        Log lg = Log.getMyLogger();
        lg.LogExecution("Метод Main()");
        double op = Operation.Run('-', 35);
        op = Operation.Run('+', 30);
    }

    public static void factoryDemo(){
        CarFactory carFactory = ConcreteFactory.getConcreteFactory();
        Client cl = new Client(carFactory);

        PrintStream pw = new PrintStream(System.out);
        pw.printf("Maximum speed of %s is %d km/h; type of body: %s\n",
                cl.getAbstractCar().toString(), cl.runMaxSpeed(), cl.getAbstractCar().getTypeOfBody());
    }
}
