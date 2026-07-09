package homeWork10.middle.accounting;
/*
Создать свою бухгалтерию.

В вашей организации есть множество сотрудников: Employee, Manager, Cleaner и т.д. У каждого есть зарплата,
а также в конце месяца начисляются бонусы, которые суммируются с зарплатой. Количество бонусов у всех разное.
Написать реализацию бухгалтерии, которая будет выводить на экран зарплату каждого сотрудника. Не забудьте
об интерфейсах и избегайте дублирование кода.
 */
public class Main {

    public static void main(String[] args) {
        Employee [] employee = {new Cleaner("Уборщик", 500, 20), new Manager("Менеджер", 1000, 10), new Programmer("Программист", 50000,0)};
        sellerCount(employee);
    }
   static void sellerCount(Employee [] employee){
        for (Employee employee1 : employee){
            employee1.salaryCalculation();
            employee1.print();
        }
    }
}