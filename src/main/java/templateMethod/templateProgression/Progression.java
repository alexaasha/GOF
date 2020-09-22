package templateMethod.templateProgression;

import java.util.ArrayList;
import java.util.List;

public abstract class Progression {
    private int first;
    private int last;
    private int h;

    public List<Integer> progList;

    public Progression(int first, int last, int h) {
        this.first = first;
        this.last = last;
        this.h = h;

        progList = new ArrayList<>();
    }

    public void templateMethod() {
        initializeProgression(first, last, h);
        progress();
        print(progList);
    }

    private void print(List<Integer> progList) {
        System.out.println("Sequence:");
        for(var item : progList) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private void initializeProgression(int a, int b, int h) {
        this.first = a;
        this.last = b;
        this.h = h;
    }

    public abstract void progress() throws IllegalArgumentException;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
