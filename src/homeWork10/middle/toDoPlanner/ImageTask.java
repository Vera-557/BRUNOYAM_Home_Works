package homeWork10.middle.toDoPlanner;

public class ImageTask extends AbstractTask{

    private String linkToImage;
    // private boolean finished;

    public ImageTask(String linkToImage) {
        this.linkToImage = linkToImage;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем картинку. Ссылка на картинку " + linkToImage);
    }

}