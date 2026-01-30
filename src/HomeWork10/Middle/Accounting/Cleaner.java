package HomeWork10.Middle.Accounting;

public class Cleaner extends Employee{

    public Cleaner(String name, double salary, double bonus) {
        super(name, salary, bonus);
    }

    @Override
    public double salaryCalculation() {
        return getSalary() * (getBonus() / 2);
    }

}