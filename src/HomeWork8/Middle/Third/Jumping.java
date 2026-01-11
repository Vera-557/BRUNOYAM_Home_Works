package HomeWork8.Middle.Third;

public class Jumping extends Exercises {
    public Jumping(double weight, double high, double age) {
        super(weight, high, age);
    }

    Jumping() {
    }

    @Override
    void calculateСalorie(Exercises exercises, double time) {
        calorie = bmr() * 1.375 * time;
        System.out.println("Прыжки\nЗа " + time + " минут вы сожжёте " + calorie + " ккал");
    }
}
