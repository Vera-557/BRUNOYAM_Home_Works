package HomeWork8.Middle.Third;

public class Swimming extends Exercises {
    public Swimming(double weight, double high, double age) {
        super(weight, high, age);
    }

    Swimming() {
    }

    @Override
    void calculateСalorie(Exercises exercises, double time) {
        calorie = bmr() * 1.725 * time;
        System.out.println("Плавание\nЗа " + time + " минут вы сожжёте " + calorie + " ккал");
    }
}
