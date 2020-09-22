package strategy.strategyNavigator;

public class BicycleNavigation extends Algorithm {
    private static final String NAME = "bicycle navigation";

    public BicycleNavigation(){
        super(NAME);
    }

    @Override
    public void mainLogic() {
        System.out.println("Creating optimal route for bicycle....");
        System.out.println("Here is a route");
    }
}
