package strategy.strategyNavigator;

public abstract class Algorithm {
    private final String name;

    public Algorithm(String name){
        this.name = name;
    }

    public abstract void mainLogic();

    public String getName() {
        return name;
    }
}
