package command;

public class ArithmeticUnit {
    private double Register;
    public void run(char operationCode, double operand) {
        switch (operationCode) {
            case '+' -> Register += operand;
            case '-' -> Register -= operand;
            case '*' -> Register *= operand;
            case '/' -> Register /= operand;
        }
    }

    public double getRegister() {
        return Register;
    }

    private void setRegister(double register) {
        Register = register;
    }
}
