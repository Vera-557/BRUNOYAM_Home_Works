package HomeWork10.Middle.ToDoPlanner;
/*
Дописать программу “Планировщик дел”, которую реализовывали во втором уроке. Возможно,
вы обратили внимание, что у классов TextTask, ImageTask и DocumentTask методы executed() и isFinished()
имеют одинаковую реализацию. Чтобы избавиться от дублирования кода, нужно создать для этих классов новый
абстрактный класс AbstractTask, который будет реализовывать интерфейс Task. Общие методы executed() и
isFinished() реализовать в AbstractTask, а метод showTask() сделать абстрактным.
 */
public abstract class AbstractTask implements Task {

    private boolean finished;
    public void executed() {
        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }

    public abstract void showTask();

}