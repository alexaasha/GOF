package strategy.strategyNavigator;

public class PedestrianNavigation extends Algorithm{
    private static final String NAME = "pedestrian navigation";

    public PedestrianNavigation(){
        super(NAME);
    }

    @Override
    public void mainLogic() {
        System.out.println("Creating optimal route for pedestrian....");
        System.out.println("Here is a route");
    }
}
