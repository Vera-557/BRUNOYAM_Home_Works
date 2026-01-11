package HomeWork8.Middle.Third;

public class Walking extends Exercises {
    public Walking(double weight, double high, double age) {
        super(weight, high, age);
    }

    Walking() {
    }

    @Override
    void calculateСalorie(Exercises exercises, double time) {
        calorie = bmr() * 1.55 * time;
        System.out.println("Ходьба\nЗа " + time + " минут вы сожжёте " + calorie + " ккал");
    }
}
