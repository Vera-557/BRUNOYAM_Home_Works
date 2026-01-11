package HomeWork8.Middle.Third;
/*
Калькулятор домашних тренировок.
Калькулятор тренировок должен уметь подсчитывать количество потерянных калорий во время тренировок.
Имеется множество видов физических упражнений — класс Exercises: например, бег, прыжки на скакалке, плаванье и т.д.
У родительского класса Exercises должен быть абстрактный метод подсчёта калорий за минуту. Каждый объект класса
Exercises имеет собственную реализацию подсчёта. Калькулятор должен получить тип упражнения и время, которое было
затрачено на упражнение (в минутах), и посчитать количество потраченных калорий.
 */

public class CalorieCounter {
    //Так написала потому что такие условия по заданию, при чтении дословно
    void raschet (Exercises exercises, double time){
        exercises.calculateСalorie(exercises,time);
    }

    public static void main(String[] args){
        CalorieCounter calorieCounter = new CalorieCounter();
        calorieCounter.raschet(new Jumping(75,179,35),75);
        calorieCounter.raschet(new Running(80,180,33),75);
        calorieCounter.raschet(new Swimming(89,175,37),75);
        calorieCounter.raschet(new Walking(76,173,29),75);
    }
}
