package command;

public class Calculator {
    ArithmeticUnit arithmeticUnit;
    ControlUnit controlUnit;

    public Calculator() {
        arithmeticUnit = new ArithmeticUnit();
        controlUnit = new ControlUnit();
    }

    private double run(Command command) {
        controlUnit.storeCommand(command);
        controlUnit.executeCommand();
        return arithmeticUnit.getRegister();
    }

    public double add(double operand) {
        return run(new Addition(arithmeticUnit, operand));
    }

    public double subtract(double operand) {
        return run(new Subtraction(arithmeticUnit, operand));
    }

    public double mul(double operand) {
        return run(new Multiplication(arithmeticUnit, operand));
    }

    public double div(double operand) {
        return run(new Division(arithmeticUnit, operand));
    }

    public double redo() {
        controlUnit.redo();
        return arithmeticUnit.getRegister();
    }

    public double undo() {
        controlUnit.undo();
        return arithmeticUnit.getRegister();
    }
}
