package HomeWork8.Middle.Third;

public abstract class Exercises {
    double calorie;//Я решила что все равно ее нигде кроме сам метод никто не меняет, поэтому оставила не приватной
    private double weight;
    private double high;
    private double age;

    abstract void calculateСalorie(Exercises exercises, double time);

    public Exercises(double weight, double high, double age) {
        System.out.printf("Ваши показатели : вес - %.2f, рост - %.2f, возраст - %.2f", weight,high,age);
        System.out.println();
        setWeight(weight);
        setHigh(high);
        setAge(age);
    }

    Exercises() {
    }

    double bmr() {
        return 10 * getWeight() + 6.25 * getHigh() + 5 * getAge();
        //Расчет базального метаболизма для мужчины
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else throw new IllegalArgumentException("Показатель веса должен быть положительным");
    }

    public void setHigh(double high) {
        if (high > 0) {
            this.high = high;
        } else throw new IllegalArgumentException("Показатель роста должен быть положительным");
    }

    public void setAge(double age) {
        if (age > 0) {
            this.age = age;
        } else throw new IllegalArgumentException("Показатель возраста должен быть положительным");
    }

    public double getWeight() {
        return weight;
    }

    public double getHigh() {
        return high;
    }

    public double getAge() {
        return age;
    }
}
