package HomeWork10.Middle.ToDoPlanner;

public class ImageTask implements Task{

    private String linkToImage;
    private boolean finished;

    public ImageTask(String linkToImage) {
        this.linkToImage = linkToImage;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем картинку. Ссылка на картинку " + linkToImage);
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