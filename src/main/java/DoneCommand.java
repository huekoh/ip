public class DoneCommand extends Command {

    private final String index;

    public DoneCommand(String index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, UI ui, Storage storage) {
        if (this.index.isBlank() || !this.index.matches("\\d+")) {
            ui.printErrInvalidIndex();
            return;
        }

        int idx = Integer.parseInt((index));

        if (idx > tasks.size() || idx <= 0) {
            ui.printErrInvalidIndex();
            return;
        }

        Task currTask = tasks.get(idx - 1);

        if (currTask.getStatus()) {
            ui.printErrUselessCommand();
            return;
        }

        currTask.setStatus(true);
        ui.printDoneTask(tasks, idx);
    }
}
