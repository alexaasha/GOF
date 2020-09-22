package decorator;

public class DecoratorOptions extends AutoBase{
    public AutoBase autoProperty;
    public String title;
    public DecoratorOptions(AutoBase au, String tit) {
        autoProperty = au;
        title = tit;
    }

    @Override
    public double GetCost() {
        return 0;
    }
}
