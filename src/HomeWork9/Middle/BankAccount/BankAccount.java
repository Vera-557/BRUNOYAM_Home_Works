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

    public BankAccount(int balance) {
        this.balance = balance;
    }

    /*
Положить деньги на счет
 */
    public void pop(int money) {
        balance += money;
    }

    /*
 Вывести деньги со счета
*/
    public void push(int money) {
        //реализовать метод
    }
}
 class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.push(500);
        bankAccount.pop(8000); //должна быть ошибка
    }
}