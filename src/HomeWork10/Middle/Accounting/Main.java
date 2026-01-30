package HomeWork10.Middle.Accounting;

public class Main {
    public static void main(String[] args) {
        Employee cleaner = new Cleaner("Уборщик", 500, 20);
        cleaner.salaryCalculation();
        cleaner.print();
        Employee manager = new Manager("Менеджер", 1000, 10);
        manager.salaryCalculation();
        manager.print();
    }
}