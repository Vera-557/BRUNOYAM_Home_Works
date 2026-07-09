package homeWork10.middle.accounting;

public abstract class Employee implements Counterable{
    private double salary;
    private double bonus;
    private final String NAME;

    public Employee(String name, double salary, double bonus) {
        this.NAME = name;
        setSalary(salary);
        setBonus(bonus);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 10){
            return;
        }
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus<0){
            return;
        }
        this.bonus = bonus;
    }
    public String getNAME(){
        return NAME;
    }
    public void print(){
        System.out.println(getNAME() + ". зарплата = " + getSalary() + " бонус = " + getBonus());
        System.out.println("Итого зарплата = " + salaryCalculation());
    }
}