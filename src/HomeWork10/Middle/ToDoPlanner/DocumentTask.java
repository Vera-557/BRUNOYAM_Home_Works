package HomeWork10.Middle.ToDoPlanner;

public class DocumentTask implements Task{

    private String documentLink;
    private boolean finished;

    public DocumentTask(String documentLink) {
        this.documentLink = documentLink;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем документ. Ссылка на документ " + documentLink);
    }

    @Override
    public void executed() {
        finished = finished;
    }

    @Override
    public boolean isFinished() {
        return finished;
    }
}