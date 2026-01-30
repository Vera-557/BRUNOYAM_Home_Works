package HomeWork10.Middle.ToDoPlanner;

public interface Task {
    void executed();
    boolean isFinished();
    public abstract void showTask();//Я это оставила из-за использования в классе листа
    //иначе, нужно массив переделать в тип абстрактного класса для вызова метода. Но так написано задание в уроке.
    //поэтому я его не меняла.
}