package HomeWork10.Middle.Accounting;
/*
Создать свою бухгалтерию.

В вашей организации есть множество сотрудников: Employee, Manager, Cleaner и т.д. У каждого есть зарплата,
а также в конце месяца начисляются бонусы, которые суммируются с зарплатой. Количество бонусов у всех разное.
Написать реализацию бухгалтерии, которая будет выводить на экран зарплату каждого сотрудника. Не забудьте
об интерфейсах и избегайте дублирование кода.
 */
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