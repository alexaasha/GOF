package facade;

import java.beans.EventHandler;

public class Notification {
    public EventHandler notificationEvent;
    private String mess;
    private String messageFin;

    public String getMessageFin() {
        return messageFin;
    }

    public void setMessageFin(String messageFin) {
        this.messageFin = messageFin;
    }

    public void StartNotification() {
        messageFin = "Operation has started";
        System.out.println(messageFin);
    }

    public void StopNotification() {
        messageFin = "Operation has finished";
        System.out.println(messageFin);
    }

    @Override
    public String toString() {
        return String.format("Information: %s", messageFin);
    }
}
