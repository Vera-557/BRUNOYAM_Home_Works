package homeWork10.middle.accounting;

public class Programmer extends Employee{
    public Programmer(String name, double salary, double bonus) {
        super(name, salary, bonus);
    }
    @Override
    public double salaryCalculation() {
        return getSalary();
    }
}
