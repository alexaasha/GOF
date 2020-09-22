package command;

public class Subtraction extends Command{
    public Subtraction(ArithmeticUnit unit, double operand) {
        this.unit = unit;
        this.operand = operand;
    }

    @Override
    public void execute() {
        unit.run('-', operand);
    }

    @Override
    public void unExecute() {
        unit.run('+', operand);
    }
}
