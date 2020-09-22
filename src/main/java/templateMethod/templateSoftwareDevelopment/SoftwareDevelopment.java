package templateMethod.templateSoftwareDevelopment;

import java.io.PrintStream;

public abstract class SoftwareDevelopment {
    private final String subject;

    public SoftwareDevelopment(String subject){
        this.subject = subject;
    }

    public void templateMethod() {
        familiarize();
        makeStructure();
        makeTests();
    }

    protected abstract void makeStructure();

    private void makeTests() {
        PrintStream pw = new PrintStream(System.out);

        pw.println("Tests:");
        for (int i = 1; i < 11; i++)
            pw.printf("Test %d %s", i, "is passed\n");
    }

    public void familiarize(){
        PrintStream pw = new PrintStream(System.out);
        pw.printf("Subject: %s\n", subject);
        pw.println();
    }

    public String getSubject() {
        return subject;
    }
}
