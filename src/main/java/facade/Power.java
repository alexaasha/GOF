package facade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Power {
    public ActionListener powerevent;
    private int power;
    private int microwavePower;

    public int getMicrowavePower() {
        return microwavePower;
    }

    public void setMicrowavePower(int microwavePower) {
        this.microwavePower = microwavePower;
        System.out.println(microwavePower);
    }

    @Override
    public String toString() {
        return String.format("Power %dw ", microwavePower);
    }
}
