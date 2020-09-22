package chainResponsibility;

public class MoneyPaymentHandler extends PaymentHandler{
    @Override
    public void Handle(Receiver receiver) {
        if (receiver.isMoneyTransfer())
            System.out.println("Transfers are made via money transfer systems");
        else if (getSuccessor() != null)
            getSuccessor().Handle(receiver);
    }
}
