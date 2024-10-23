package Task4.Question3;

public class BankAccount {
    private final long account_no;
    private double balance;

    BankAccount(long account_no, double balance) {
        this.account_no = account_no;
        this.balance = balance;
    }

    public void deposit(double money) {
        balance += money;
        System.out.println("Rs: " + money + " has been deposited in your account");
        checkBalance();
    }

    public void withdraw(double money) {
        if (balance < money) {
            System.out.println("Sufficient balance is not there in your account");
            return;
        }
        balance -= money;
        System.out.println("Rs: " + money + " has been withdraw from your account");
        checkBalance();
    }

    public void checkBalance() {
        System.out.println("Your account balance is Rs: " + balance);
    }
}
