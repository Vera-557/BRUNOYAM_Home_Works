package HomeWork10.Middle.ToDoPlanner;

public class TextTask implements Task {
    private String text;
    private boolean finished;
    public TextTask(String text) {
        this.text = text;
    }
    @Override
    public void showTask() {
        System.out.println("Отображаем текст " + text);
    }

    @Override
    public void executed() {
        finished = true;
    }

    @Override
    public boolean isFinished() {
        return finished;
    }
}