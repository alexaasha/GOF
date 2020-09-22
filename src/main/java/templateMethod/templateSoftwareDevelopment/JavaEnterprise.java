package templateMethod.templateSoftwareDevelopment;

import java.io.PrintStream;

public class JavaEnterprise extends SoftwareDevelopment{
    public JavaEnterprise(String subject) {
        super(subject);
    }

    @Override
    protected void makeStructure() {
        PrintStream pw = new PrintStream(System.out);
        pw.println("Structure:");
        pw.println("main class");
        pw.printf("%s business logic class\n", getSubject());
        pw.printf("%s api class\n", getSubject());
        pw.println("unit tests");
        pw.println();
    }
}
