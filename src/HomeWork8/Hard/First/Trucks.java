package HomeWork8.Hard.First;

public class Trucks extends Vehicle {
    private int power;
    public String forType;

    public Trucks(String type, double price, int power, String forType) {
        super(type, price);
        setPower(power);
        setForType(forType);
    }
    public Trucks( double price, int power, String forType) {
        super("Грузовой автомобиль", price);
        setPower(power);
        setForType(forType);
    }

    public Trucks() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 180) {
            this.power = power;
        }else throw new IllegalArgumentException("Недопустимое значение мощности двигателя");
    }

    public String getForType() {
        return forType;
    }

    public void setForType(String forType) {
        if (forType.isEmpty()){
            System.out.println("Введите тип специального средства");
            return;
        }
        this.forType = forType;
    }

    @Override
    public String toString() {
        return getType() + ": цена - " + getPrice() + ", мощность двигателя - " + power + ", тип: " + forType;
    }
}
