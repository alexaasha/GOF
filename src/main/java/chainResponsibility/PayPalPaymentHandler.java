package chainResponsibility;

public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void Handle(Receiver receiver) {
        if (receiver.isPayPalTransfer())
            System.out.println("A paypal transfer is being made");
        else if (getSuccessor() != null)
            getSuccessor().Handle(receiver);
    }
}
