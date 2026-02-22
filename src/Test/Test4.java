package Test;

public class Test4 {
    public static void main(String[] args) {
        // Create account with initial balance of 1000
        BankAccount myAccount = new BankAccount(1000.0);
        // Deposit 500
        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: " + myAccount.getBalance());
        // Withdraw 200
        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Setting to 0.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Transaction cancelled.");
        } else {
            balance -= amount;
        }
    }

}

