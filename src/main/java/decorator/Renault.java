package decorator;

public class Renault extends AutoBase{
    public Renault(String name, String info, double costBase) {
        setCostBase(costBase);
        setDescription(info);
        setName(name);
    }

    @Override
    public double GetCost() {
        return getCostBase() * 1.18;
    }
}
