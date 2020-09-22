package chainResponsibility;

class BankPaymentHandler extends PaymentHandler{
    @Override
    public void Handle(Receiver receiver) {
        if (receiver.isBankTransfer())
            System.out.println("A Bank transfer is being made");
        else if (getSuccessor() != null)
            getSuccessor().Handle(receiver);
    }
}
