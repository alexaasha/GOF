package strategy.strategySort;

public abstract class StrategySort {
    private String title;
    public abstract void sort(int[] array);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}