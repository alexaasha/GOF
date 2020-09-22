package facade;

public class Microwave {
    private Drive drive;
    private Power power;
    private Notification notification;

    public Microwave(Drive drive, Power power, Notification notification) {
        this.drive = drive;
        this.power = power;
        this.notification = notification;
    }

    public void Defrost() {
        notification.StartNotification();
        power.setMicrowavePower(1000);
        drive.TurlRight();
        drive.TurlRight();
        power.setMicrowavePower(500);
        drive.Stop();
        drive.TurlLeft();
        drive.TurlLeft();
        power.setMicrowavePower(200);
        drive.Stop();
        drive.TurlRight();
        drive.TurlRight();
        drive.Stop();
        power.setMicrowavePower(0);
        notification.StopNotification();
    }

    public void cooking(){
        notification.StartNotification();
        power.setMicrowavePower(1000);
        drive.TurlRight();
        drive.TurlRight();
        drive.TurlRight();
        drive.TurlRight();
        power.setMicrowavePower(200);
        drive.TurlRight();
        drive.TurlRight();
        drive.Stop();
    }
}
