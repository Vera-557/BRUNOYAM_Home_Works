package homeWork10.middle.accounting;

public class Manager extends Employee{

    public Manager(String name, double salary, double bonus) {
        super(name, salary, bonus);
    }

    @Override
    public double salaryCalculation() {
        return getSalary() * getBonus();
    }
}