package chainResponsibility;

public class Demo {
    public static void main() {
        Receiver receiver = new Receiver(false, false, true);

        PaymentHandler bankPaymentHandler = new BankPaymentHandler();
        PaymentHandler moneyPaymentHandler = new MoneyPaymentHandler();
        PaymentHandler paypalPaymentHandler = new PayPalPaymentHandler();

        bankPaymentHandler.setSuccessor(paypalPaymentHandler);
        paypalPaymentHandler.setSuccessor(moneyPaymentHandler);

        bankPaymentHandler.Handle(receiver);
    }
}
