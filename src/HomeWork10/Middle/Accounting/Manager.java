package HomeWork10.Middle.Accounting;

public class Manager extends Employee{

    public Manager(String name, double salary, double bonus) {
        super(name, salary, bonus);
    }

    @Override
    public double salaryCalculation() {
        return getSalary() * getBonus();
    }
}