package HomeWork8.Middle.Third;

public class Running extends Exercises {
    public Running(double weight, double high, double age) {
        super(weight, high, age);
    }

    Running() {
    }

    @Override
    void calculateСalorie(Exercises exercises, double time) {
        calorie = bmr() * 1.9 * time;
        System.out.println("Бег\nЗа " + time + " минут вы сожжёте " + calorie + " ккал");
    }}