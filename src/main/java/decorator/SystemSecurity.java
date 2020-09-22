package decorator;

public class SystemSecurity extends DecoratorOptions{
    public SystemSecurity(AutoBase au, String tit) {
        super(au, tit);
        setName(au.getName() + ". High safety");
        setDescription(au.getDescription() + ". " + this.title
                + ". Front side airbags, " +
                "ESP - dynamic vehicle stabilization system");
    }

    @Override
    public double GetCost() {
        return autoProperty.GetCost() + 20.99;
    }
}
