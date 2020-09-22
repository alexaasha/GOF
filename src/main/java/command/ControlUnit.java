package command;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {
    private final List<Command> commands = new ArrayList<Command>();
    private int current = 0;

    public void storeCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        commands.get(current).execute();
        current++;
    }

    public void undo() {
        commands.get(current - 1).unExecute();
    }

    public void redo() {
        commands.get(current - 1).execute();
    }
}
