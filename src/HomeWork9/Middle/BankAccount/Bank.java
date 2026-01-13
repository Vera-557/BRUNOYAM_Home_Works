package HomeWork9.Middle.BankAccount;

public class Bank {
    BankAccount [] counts = new BankAccount[10];
 }
class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.push(1100);
       // bankAccount.pop(8000);
        System.out.println(bankAccount.getBalance());
    }
}