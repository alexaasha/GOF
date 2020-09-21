package climateControl;

import java.io.PrintStream;

public class Demo {
    public static void main(){
        PrintStream pw = new PrintStream(System.out);
        Sensor sensor = new Sensor();
        pw.printf("Temperature in fahrenheit = %d\n", sensor.getTemperatureFahrenheit());

        Firmware soft = new Firmware(new FirmwareAdapter(sensor));
        pw.printf("Temperature in celsius = %d\n", soft.getTemperatureCelsius());
    }
}
