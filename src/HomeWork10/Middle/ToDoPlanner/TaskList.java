package HomeWork10.Middle.ToDoPlanner;

public class TaskList {
    private Task [] tasks;
    public TaskList (Task [] tasks){
        this.tasks = tasks;
    }
    public void showFinishedTasks(){
        System.out.println("Завершенные задачи");
        for (int i = 0; i< tasks.length; i++){
            if (tasks[i].isFinished()){
                tasks[i].showTask();
            }
        }
    }
    public void showUnfinishedTasks(){
        System.out.println("Незавершенные задачи");
        for (int i = 0; i< tasks.length; i++){
            if (!tasks[i].isFinished()){
                tasks[i].showTask();
            }
        }
    }
}