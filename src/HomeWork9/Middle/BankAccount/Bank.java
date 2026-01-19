package HomeWork9.Middle.BankAccount;
/*
Создайте свой банк, который может проводить операции с банковскими счетами.

У банка (класс Bank) есть массив счетов — BankAccount, на которых лежат деньги. Банк может переводить деньги со счёта 1 на счёт 2 и т.д. Операция должна быть отклонена банком, если денег на счёте для перевода недостаточно.

При написании программы не забывайте про модификаторы доступа (private, protected, public)
 */
public class Bank {
    private BankAccount [] counts = new BankAccount[3];
    int size = 0;

    void add(BankAccount bankAccount){
        counts[size] = bankAccount;
        size++;
        if (size == counts.length){
            BankAccount [] temp = new BankAccount[counts.length * 2];
            for (int i = 0; i < counts.length; i++){
                temp[i] = counts[i];
            }
            counts = temp;
        }
    }
    void transfer(BankAccount bankAccount1, BankAccount bankAccount2, int summ){
        //просто делаем имитацию перевода денег
        if (bankAccount1.getBalance() >= summ){
            bankAccount2.pop(summ);
            bankAccount1.push(summ);
        }
    }
    void print(){
        for (int i = 0; i < counts.length; i++){
            if (counts[i] != null) {
                System.out.println(counts[i]);
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.push(1100);
        bankAccount.pop(8000);
        System.out.println(bankAccount.getBalance());
        System.out.println("---------------");
        BankAccount bankAccount1 = new BankAccount("Луна",1000);
        BankAccount bankAccount2 = new BankAccount("Клава",3000);
        BankAccount bankAccount3 = new BankAccount("Леонид",2000);
        Bank bank = new Bank();
        bank.add(bankAccount1);
        bank.add(bankAccount2);
        bank.add(bankAccount3);
        bank.print();
        System.out.println("-----------------");
        //переводим баблишко
        bank.transfer(bankAccount1,bankAccount2,200);
        bank.print();
    }
}