package strategy.strategyNavigator;

public class CarNavigation extends Algorithm{
    private static final String NAME = "car navigation";

    public CarNavigation(){
        super(NAME);
    }

    @Override
    public void mainLogic() {
        System.out.println("Creating optimal route....");
        System.out.println("Here is a route");
    }
}
