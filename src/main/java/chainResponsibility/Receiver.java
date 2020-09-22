package chainResponsibility;

public class Receiver {
    private boolean bankTransfer;
    private boolean moneyTransfer;
    private boolean payPalTransfer;

    public Receiver(boolean bt, boolean mt, boolean ppt) {
        bankTransfer = bt;
        moneyTransfer = mt;
        payPalTransfer = ppt;
    }

    public boolean isBankTransfer() {
        return bankTransfer;
    }

    public void setBankTransfer(boolean bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    public boolean isMoneyTransfer() {
        return moneyTransfer;
    }

    public void setMoneyTransfer(boolean moneyTransfer) {
        this.moneyTransfer = moneyTransfer;
    }

    public boolean isPayPalTransfer() {
        return payPalTransfer;
    }

    public void setPayPalTransfer(boolean payPalTransfer) {
        this.payPalTransfer = payPalTransfer;
    }
}
