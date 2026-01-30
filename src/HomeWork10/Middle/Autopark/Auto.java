package HomeWork10.Middle.Autopark;

/*
Создайте свой автопарк

В вашем автопарке множество машин, которые можно сдать в аренду. У каждой машины есть год выпуска и пробег.
Все машины не старше 20 лет и у всех машин пробег не больше 10 000 км. Каждая марка автомобиля имеет свой
коэффициент от 1 до 10, например Жигули — 1, BMW — 8, Porsсhe —10. Когда нужно посчитать сумму за аренду,
нужно рассчитывать по следующей формуле:

СУММА = ((10 000 - пробег) * (20 - возраст авто) * коэффициент * время аренды) / 1000

Задача: создать классы автомобилей и каждому классу присвоить свой коэффициент.

Создать экземпляры классов данных автомобилей, передать в конструктор параметры пробега и возраст
автомобиля. Калькулятор должен выводить стоимость аренды автомобиля за час.
 */
public abstract class Auto {
    private int madeInYear;
    private double running;
    private String name;
    private double ratio;
    private double rentTime;

    Auto(String name, int madeInYear, double running, double ratio) {
        setName(name);
        setMadeInYear(madeInYear);
        setRunning(running);
        this.ratio = ratio;
    }

    private void setMadeInYear(int madeInYear) {
        if (madeInYear < 2006) {
            System.out.println("Автомобиль слишком старый для аренды");
            return;
        }
        this.madeInYear = madeInYear;
    }

    private void setRunning(double running) {
        if (running > 10_000) {
            System.out.println("Автомобиль имеет слишком большой пробег");
            return;
        }
        this.running = running;
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Не указана марка автомобиля");
        }
        this.name = name;
    }

    public double rentCounter(double rentTime) {
        this.rentTime = rentTime;
        return ((10000 - running) * (20 - (2026 - madeInYear)) * ratio * rentTime) / 1000;
    }

    public int getMadeInYear() {
        return madeInYear;
    }

    public double getRunning() {
        return running;
    }

    public String getName() {
        return name;
    }

    public double getRatio() {
        return ratio;
    }

    public double getRentTime() {
        return rentTime;
    }

    @Override
    public String toString() {
        return "Auto : марка: " + name + ", год выпуска: " + madeInYear + ", пробег: " + running +
                ", коэффициент: " + ratio;
    }
}
