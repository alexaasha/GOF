package decorator;

public class Audi extends AutoBase{
    public Audi(String name, String info, double costBase) {
        setCostBase(costBase);
        setDescription(info);
        setName(name);
    }

    @Override
    public double GetCost() {
        return getCostBase() * 3;
    }
}
