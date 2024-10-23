//3. Create a class BankAccount with private fields for account number and balance. Implement methods to deposit, withdraw, and check the balance, ensuring proper encapsulation.

package Task4.Question3;

public class Q3 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(23123432, 5000);
        account1.checkBalance();
        account1.deposit(1000);
        account1.withdraw(90000);
        account1.withdraw(500);
    }
}
