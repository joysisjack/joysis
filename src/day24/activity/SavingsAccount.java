
package day24.activity;

public class SavingsAccount extends Account implements Transaction{

    private double interestRate;
    
    public SavingsAccount(String accountName, String accountNumber, double balance, double interestRate) {
        super(accountName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("======= Savings Account Info =======");
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Interest : " + interestRate + "%");
        
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Success!");
        System.out.println("New Balance : " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Widthrawal Success!");
            System.out.println("New Balance : " + balance);
        }else{
            System.out.println("Insuficient Amount! transaction rejected");
        }
        
    }
    
}
