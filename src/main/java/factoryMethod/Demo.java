package factoryMethod;

import java.io.PrintStream;

public class Demo {
    public static void main() {
        TransportCompany trCom = new TaxiTransCom("taxi");
        TransportService compService = trCom.Create("taxi", 1);

        double dist = 15.5;
        Print(compService, dist);

        TransportCompany gCom = new ShipTransCom("transportation");
        compService = gCom.Create("cargo transportation", 2);
        double distg = 150.5;
        Print(compService, distg);
    }

    private static void Print(TransportService compTax, double distg) {
        PrintStream pw = new PrintStream(System.out);
        pw.printf("service: %s, distance: %f, price: %f, drunk driver: %b\n",
                compTax.toString(),
                distg,
                compTax.CostTransportation(distg),
                compTax.getDrunkDriver());
    }
}
