package command;

public class Demo {
    public static void main() {
        var calculator = new Calculator();
        double result = 0;

        result = calculator.add(5);
        System.out.println(result);
        result = calculator.add(4);
        System.out.println(result);
        result = calculator.add(3);
        System.out.println(result);
        result = calculator.redo();
        System.out.println(result);
        result = calculator.undo();
        System.out.println(result);
        result = calculator.div(3);
        System.out.println(result);
    }
}
