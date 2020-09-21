package climateControl;

public class Firmware implements ThirdPartySoftware {
    private final ThirdPartySoftware sensor;
    public Firmware(ThirdPartySoftware sensor){
        this.sensor = sensor;
    }

    @Override
    public int getTemperatureCelsius() {
        return sensor.getTemperatureCelsius();
    }
}
