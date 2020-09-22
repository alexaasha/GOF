package chainResponsibility;

public abstract class PaymentHandler {
    private PaymentHandler Successor;
    public abstract void Handle(Receiver receiver);

    public PaymentHandler getSuccessor() {
        return Successor;
    }

    public void setSuccessor(PaymentHandler successor) {
        Successor = successor;
    }
}
