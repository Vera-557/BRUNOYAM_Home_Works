package HomeWork10.Middle.ToDoPlanner;

public class TaskList {
    private Task[] tasks;

    public TaskList(Task[] tasks) { //конструктор
        this.tasks = tasks; //присваиваем полю this.tasks переданный tasks
    }

    public void showFinishedTasks() {
        System.out.println("Завершенные задачи");
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].isFinished()) { //проверяем, завершено ли дело
                tasks[i].showTask();
            }
        }
    }

    public void showUnfinishedTasks() {
        System.out.println("Незавершенные задачи");
        for (int i = 0; i < tasks.length; i++) {
            if (!tasks[i].isFinished()) { //проверяем,что дело не завершено
                tasks[i].showTask();
            }
        }
    }
}