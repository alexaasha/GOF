package climateControl;

import java.util.Random;

public class Sensor{
    private final int temperatureF;
    public Sensor(){
        temperatureF = new Random().nextInt(100);
    }

    public int getTemperatureFahrenheit() {
        return temperatureF;
    }
}
