package templateMethod.templateProgression;

public class ArithmeticProgression extends Progression{
    public ArithmeticProgression(int first, int last, int h) {
        super(first, last, h);
    }

    @Override
    public void progress() {
        int fF = getFirst();
        do {
            progList.add(fF);
            fF = fF + getH();
        } while (fF < getLast());
    }
}
