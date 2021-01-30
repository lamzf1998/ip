public class Event extends Task {
    protected String atDate;

    public Event() {};

    public Event(String description, String at) {
        super(description);
        this.atDate = at;
    }

    public String printDescription() {
        return "[E]" + super.printDescription() + " (at: " + atDate + ")";
    }
}