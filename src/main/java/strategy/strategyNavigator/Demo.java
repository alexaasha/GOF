package strategy.strategyNavigator;

public class Demo {
    public static void main() {
        Context context = Context.getContext();
        Algorithm showMap = new ShowMap();
        Context.setAlgorithm(showMap);

        context.executeLogic();
    }
}
