
package day5.activity;


public class Activity2_Cabiling {
    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        double balance = income;
        
        balance  -= foodAllowance;
        balance -= transportation;
        balance -= rent;
        balance -= utilityBill;
        
        System.out.println("Income : " + (int) income );
        System.out.println("Food Allowance : " + (foodAllowance / income) *100 + "%");
        System.out.println("Transportation : " + (transportation / income ) *100 + "%");
        System.out.println("Rent : " + (rent/income)*100 + "%");
        System.out.printf("Utilities : %.1f%%%n", (utilityBill / income) * 100);
        
        System.out.println("Remaining Balance: " + (int) balance);
    }
}
