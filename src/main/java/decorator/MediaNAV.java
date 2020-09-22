package decorator;

public class MediaNAV extends DecoratorOptions{
    public MediaNAV(AutoBase p, String t){
        super(p, t);
        setName(p.getName() + ". New");
        setDescription(p.getDescription() + ". " + this.title +
                ". Updated multimedia system");
    }

    @Override
    public double GetCost() {
        return autoProperty.GetCost() + 15.99;
    }
}
