
package day24.activity;


public class Main {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount("Baldo Baldevino" , "SA000090" , 50000, 5);
        CheckingAccount myChecking = new CheckingAccount("Kent Relate" , "CA00200" , 8000 , 10000);
        
        mySavings.displayAccountInfo();
        myChecking.displayAccountInfo();
        
        mySavings.deposit(100);
        myChecking.deposit(100);
        myChecking.withdraw(9000);
        
        
    }
}
