package bmo.task;

public class Task {
    protected String task;
    protected Boolean isDone;

    public Task(String task) {
        this.task = task;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); // mark done task with X
    }

    public Boolean getStatus() {
        return this.isDone;
    }

    public void setStatus(Boolean b) {
        this.isDone = b;
    }

    public String toSaveData() {
        String done = this.getStatus() ? "1" : "0";
        return "T | " + done + " | " + super.toString() + "\n";
    }

    @Override
    public String toString() {
        return this.task;
    }
}
