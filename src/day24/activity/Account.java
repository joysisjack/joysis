
package day24.activity;

interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

abstract class Account {
    protected String accountName, accountNumber;
    protected double balance;
    
    public Account(String accountName, String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public abstract void displayAccountInfo();
}
