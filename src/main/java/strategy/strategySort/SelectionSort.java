package strategy.strategySort;

public class SelectionSort extends StrategySort{
    public SelectionSort() {
        setTitle("Selection sort");
    }

    @Override
    public String toString() {
        return getTitle();
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[k] > array[j])
                    k = j;
            }

            if (k != i) {
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
            }
        }
    }
}
