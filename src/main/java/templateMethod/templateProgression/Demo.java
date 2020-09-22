package templateMethod.templateProgression;

public class Demo {
    public static void main() {
        Progression arithmeticProgression = new ArithmeticProgression(2,10,1);
        arithmeticProgression.templateMethod();

        Progression geometricProgression = new GeometricProgression(2,10,2);
        geometricProgression.templateMethod();
    }
}
