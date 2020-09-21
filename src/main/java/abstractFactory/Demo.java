package abstractFactory;

import java.io.PrintStream;

public class Demo {
    public static void main(){
        CarFactory ford_car = new FordFactory();
        Client c1 = new Client(ford_car);

        PrintStream pw = new PrintStream(System.out);
        pw.printf("Maximum speed of %s is %d km/h; type of body: %s\n",
                c1.getAbstractCar().toString(), c1.runMaxSpeed(), c1.getAbstractCar().getTypeOfBody());

        CarFactory audi_car = new AudiFactory();
        Client c2 = new Client(audi_car);

        pw.printf("Maximum speed of %s is %d km/h; type of body: %s\n",
                c2.getAbstractCar().toString(), c2.runMaxSpeed(), c2.getAbstractCar().getTypeOfBody());
    }
}
