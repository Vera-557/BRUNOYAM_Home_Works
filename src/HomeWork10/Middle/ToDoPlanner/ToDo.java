package HomeWork10.Middle.ToDoPlanner;

public class ToDo {
    public static void main(String[] args) {
        AbstractTask doc = new DocumentTask("document");
        AbstractTask image = new ImageTask("https://i.pinimg.com/736x/cc/02/7c/cc027c1122c8942d37cf978b023a4761.jpg");
        AbstractTask text = new TextTask("text");
        AbstractTask [] tasks = {doc,image,text};
        for (AbstractTask task : tasks){
            task.executed();
            task.showTask();//вызов нашего метода из абстрактного класса
        }
        TaskList taskList = new TaskList(new Task[]{doc,image,text});
        //taskList.showFinishedTasks();//мы все задачи завершили в цикле выше
        taskList.showUnfinishedTasks();//тут вызов из интерфейса
    }
}