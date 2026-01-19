package HomeWork9.Middle.BankAccount;
/*
Создайте класс BankAccount — банковский счёт, у которого два метода: положить деньги на счёт и перевести деньги на другой счёт.
void push(int money);
void pop(int money);
У каждого счёта есть баланс (поле balance), который не может быть меньше 0.
Создайте тестовый класс Main и метод main, в котором создайте объект класса BankAccount. Попробуйте сначала
положить на счёт сумму, потом снять со счёта другую сумму. Если запрашиваемая сумма на перевод больше текущего баланса,
то должно быть предупреждение, что средств недостаточно для перевода.
При написании программы не забывайте про модификаторы доступа (private, protected, public)
 */
public class BankAccount {
    private int balance;
    private String name;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    //Положить деньги на счет
    public void pop(int money) {
        balance += money;
    }
    //Вывести деньги со счета
    public void push(int money) {
        //реализовать метод
        if (money <= balance && money >= 0){
            balance -= money;
        }else System.out.println("Ошибка! Не достаточно средств.");
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Имя владельца: " + name + ", баланс " + balance;
    }
}