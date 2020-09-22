package decorator;

public class Demo {
    public static void main() {
        Renault reno = new Renault("Renault", "Renault LOGAN Active", 499.0);
        print(reno);

        AutoBase myReno = new MediaNAV(reno, "Navigation");
        print(myReno);

        AutoBase newMyReno = new SystemSecurity (new MediaNAV(reno, "Navigation"),
                "Safety");
        print(newMyReno);

        Audi audi = new Audi("Audi", "Audi A8", 2000.0);
        print(audi);

        AutoBase myAudi = new MediaNAV(audi, "Navigation");
        print(myAudi);
    }

    private static void print(AutoBase av) {
        System.out.println(av.toString());
    }
}
