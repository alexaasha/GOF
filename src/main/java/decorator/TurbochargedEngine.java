package decorator;

public class TurbochargedEngine extends DecoratorOptions{
    public TurbochargedEngine(AutoBase au, String tit) {
        super(au, tit);
        setName(au.getName() + ". Powerful");
        setDescription(au.getDescription() + ". " + this.title +
                ". Upgraded engine");
    }

    @Override
    public double GetCost() {
        return autoProperty.GetCost() * 2;
    }
}
