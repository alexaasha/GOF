package facade;

public class Demo {
    public static void main() {
        var drive = new Drive();
        var power = new Power();
        var notification = new Notification();
        var microwave = new Microwave(drive, power, notification);

//        microwave.Defrost();
        microwave.cooking();
    }

    static void notificationNotificationEvent(Object sender) {
        Notification n = (Notification)sender;
        System.out.println(n.toString());
    }

    static void driveDriveEvent(Object sender) {
        Drive d = (Drive)sender;
        System.out.println(d.toString());
    }

    private static void powerPowerEvent(Object sender) {
        Power p = (Power)sender;
        System.out.println(p.toString());
    }
}
