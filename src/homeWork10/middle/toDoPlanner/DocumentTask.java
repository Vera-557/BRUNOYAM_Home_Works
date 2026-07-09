package homeWork10.middle.toDoPlanner;

public class DocumentTask extends AbstractTask{

    private String documentLink;
    //private boolean finished;

    public DocumentTask(String documentLink) {
        this.documentLink = documentLink;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем документ. Ссылка на документ " + documentLink);
    }

}