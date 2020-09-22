package strategy.strategySort;

public class Demo {
    public static void main() {
        int[] arr1 = { 31, 15, 10, 2, 4, 2, 14, 23, 12, 66 };
        StrategySort sort = new SelectionSort();
        Context context = new Context(sort, arr1);

        context.sort();
        context.printArray();

        int[] arr2 = { 1, 5, 10, 2, 4, 12, 14, 23, 12, 66 };
        sort = new InsertionSort();
        context = new Context(sort, arr2);

        context.sort();
        context.printArray();

        int[] arr3 = { 1, 5, 0, 12, 4, 112, 3, 23, 167, 69 };
        sort = new BubbleSort();
        context = new Context(sort, arr3);

        context.sort();
        context.printArray();
    }
}
