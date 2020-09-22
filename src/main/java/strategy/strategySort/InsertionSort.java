package strategy.strategySort;

public class InsertionSort extends StrategySort{
    public InsertionSort() {
        setTitle("Insertion sort");
    }

    @Override
    public String toString() {
        return getTitle();
    }

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            int buffer = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] < buffer)
                break;
                array[j + 1] = array[j];
            }
            array[j + 1] = buffer;
        }
    }
}