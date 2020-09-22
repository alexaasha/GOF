package decorator;

public abstract class AutoBase {
    private String name;
    private String description;
    private double costBase;

    public abstract double GetCost();

    @Override
    public String toString() {
        return String.format("Your car: \n%s \nDescription: %s \nPrice: %f\n",
                name, description, GetCost());
    }

    public double getCostBase() {
        return costBase;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setCostBase(double costBase) {
        this.costBase = costBase;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}
