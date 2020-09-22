package facade;

import java.beans.EventHandler;

public class Drive {
    public EventHandler driveEvent;
    private String twist;

    public String getTwist() {
        return twist;
    }

    public void setTwist(String twist) {
        this.twist = twist;
    }

    public Drive() {
        twist = "source position";
        System.out.println(twist);
    }

    public void TurlLeft() {
        twist = "turn left";
        System.out.println(twist);
    }

    public void TurlRight() {
        twist = "turn right";
        System.out.println(twist);
    }

    public void Stop() {
        twist = "stop";
        System.out.println(twist);
    }

    @Override
    public String toString() {
        return String.format("Drive: %s", twist);
    }
}
