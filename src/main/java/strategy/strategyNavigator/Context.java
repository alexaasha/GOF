package strategy.strategyNavigator;

public class Context {
    private static Algorithm algorithm;
    private static Context context;

    private Context(){}

    public static void setAlgorithm(Algorithm algorithm) {
        Context.algorithm = algorithm;
    }

    public void executeLogic() throws NullPointerException{
        if (algorithm != null) {
            System.out.println(algorithm.getName());
            algorithm.mainLogic();
        }else throw new NullPointerException("Algorithm is unknown!");
    }

    public static Context getContext() {
        if (context == null)
            context = new Context();

        return context;
    }
}
