package strategy.strategySort;

import java.io.PrintStream;

public class Context {
    StrategySort strategy;
    int[] array;

    public Context(StrategySort strategy, int[] array) {
        this.strategy = strategy;
        this.array = array;
    }

    public void sort() {
        strategy.sort(array);
    }

    public void printArray() {
        PrintStream pw = new PrintStream(System.out);
        pw.println(strategy.toString());
        for (int j : array) pw.print(j + " ");

        pw.println();
    }
}