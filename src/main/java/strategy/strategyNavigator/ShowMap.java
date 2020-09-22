package strategy.strategyNavigator;

import java.util.SortedMap;

public class ShowMap extends Algorithm{
    private static final String NAME = "show map";

    public ShowMap(){
        super(NAME);
    }

    @Override
    public void mainLogic() {
        System.out.println("Prepare to show ....");
        System.out.println("Here is a map!");
    }
}
