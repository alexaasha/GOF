package strategy.strategySort;

public class BubbleSort extends StrategySort{
    public BubbleSort() {
        setTitle("Bubble sort");
    }

    @Override
    public String toString() {
        return getTitle();
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}
