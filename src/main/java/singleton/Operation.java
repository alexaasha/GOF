package singleton;

public class Operation {
    public static double Run(char operationCode, int operand) {
        Log lg2 = Log.getMyLogger();
        double rez = 0;
        switch (operationCode) {
            case '+' -> {
                rez += operand;
                lg2.LogExecution("Сложение " + operand);
            }
            case '-' -> {
                rez -= operand;
                lg2.LogExecution("Вычитание " + operand);
            }
            case '*' -> rez *= operand;
            case '/', ':' -> rez /= operand;
        }
        return rez;
    }
}
