package HomeWork9.Hard;

/*
Создайте свой банк, который может проводить операции с банковскими счетами.
При создании должен задаваться максимальный денежный баланс банка, например 1000р.
Банк может создавать счета и класть туда деньги. Суммарное количество денег на счетах
не должно превышать баланса банка. Например, 2 счёта по 400р — не превышают начальный
баланс в 1000р, а вот 2 счёта по 600р уже превышают.
Банк также должен уметь переводить деньги со счёта на счёт. При этом сумма денег
на всех счетах должна всегда оставаться 1000р.
При написании программы не забывайте про модификаторы доступа (private, protected, public)
 */
public class Bank {

    private double maxBalance = 1000;
    private double currentTotalBalance = 0;
    private int size = 0;
    private Account[] accs = new Account[10];

    void createAccount(Account account) {
        if (currentTotalBalance + account.getBalance() <= maxBalance) {
            // Увеличиваем массив при необходимости
            if (size == accs.length) {
                Account[] temp = new Account[size * 2];
                System.arraycopy(accs, 0, temp, 0, size);
                accs = temp;
            }
            // Добавляем счет
            accs[size] = account;
            size++;
            currentTotalBalance += account.getBalance();
            System.out.println("Счет создан. Текущий баланс банка: " + currentTotalBalance);
        } else {
            System.out.println("Ошибка: превышен максимальный баланс банка!");
            System.out.println("Текущий баланс: " + currentTotalBalance +
                    ", попытка добавить: " + account.getBalance());
        }
    }

    void transit(Account account1, Account account2) {
        //перевод не превысит сумму все равно, так как у нас ограничение общей суммы стоит
    }

    double push() {
        return 0;
    }

    double pop() {
        return 0;
    }
    void show (){
        for (Account account : accs) {
            if (account != null) {
                System.out.println("Держатель счета: " + account.getName() + ", баланс: " + account.getBalance());
            }
        }
    }
}

class Account {
    private double balance;
    private String name;

    public Account(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount(new Account("Нина", 100));
        bank.createAccount(new Account("Кристина", 200));
        bank.createAccount(new Account("Полина", 800));
        bank.createAccount(new Account("Зинаида", 100));
        bank.show();
    }
}

