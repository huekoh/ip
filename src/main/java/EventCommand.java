import java.time.LocalDateTime;

public class EventCommand extends Command {

    private final String desc;
    private final LocalDateTime start;
    private final LocalDateTime end;

    public EventCommand(String desc, LocalDateTime start, LocalDateTime end) {
        this.desc = desc;
        this.start = start;
        this.end = end;
    }

    public void execute(TaskList tasks, UI ui, Storage storage) {
        Task newTask = new Events(this.desc, this.start, this.end);
        tasks.add(newTask);
        ui.printAddTask(newTask, tasks.size());
    }
}