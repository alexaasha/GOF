package templateMethod.templateProgression;

public class GeometricProgression extends Progression{
    public GeometricProgression(int first, int last, int h) {
        super(first, last, h);
    }

    @Override
    public void progress() throws IllegalArgumentException {
        if (getH() == 1)
            throw new IllegalArgumentException("Geometric progression's step can't be 1");

        int fF = getFirst();
        do {
            progList.add(fF);
            fF = fF * getH();
        } while (fF < getLast());
    }
}
