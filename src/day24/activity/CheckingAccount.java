package day24.activity;

public class CheckingAccount extends Account implements Transaction {

    private double overDraftLimit;

    public CheckingAccount(String accountName, String accountNumber, double balance, double overDraftLimit) {
        super(accountName, accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("====== Account Info ======");
        System.out.println("Account Type : Checking");
        System.out.println("Account Name : " + accountName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Overdraft Limit : " + overDraftLimit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Success!");
        System.out.println("New Balance : " + balance);
    }

    @Override
    public void withdraw(double amount) {
         if (balance - amount >= -overDraftLimit) {
            balance -= amount;
             System.out.println("Withdraw Success!");
             System.out.println("New Balance : " + balance);
        } else {
            System.out.println("Insufficient Funds or Credit");
        }
    }
}
