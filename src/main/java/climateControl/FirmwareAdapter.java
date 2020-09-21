package climateControl;

public class FirmwareAdapter implements ThirdPartySoftware {
    private final Sensor sensor;
    private static final int CONVERTING_CONSTANT = 32;

    public FirmwareAdapter(Sensor sensor){
        this.sensor = sensor;
    }

    @Override
    public int getTemperatureCelsius() {
        return sensor.getTemperatureFahrenheit() - CONVERTING_CONSTANT;
    }
}
