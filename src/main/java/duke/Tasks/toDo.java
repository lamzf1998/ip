package duke.Tasks;

import duke.Tasks.Task;

public class toDo extends Task {
    public toDo() {};
    public toDo(String description) {
        super(description);
    }

    public String printDescription() {
        return "[T]" + super.printDescription();
    }
}