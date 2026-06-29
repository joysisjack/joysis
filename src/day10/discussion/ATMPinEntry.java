
package day10.discussion;

import java.util.Scanner;


public class ATMPinEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 3;
        int defaultPin = 123456;
        
        while(true){
            System.out.println("Welcome to ATM Machine");
            System.out.print("Enter your pin: ");
            int pin = input.nextInt();
            if(pin == defaultPin){
                System.out.println("Access Granted!");
                break;
            }else{
                System.out.println("Invalid Pin Please Try Again! (Attempt :" + (attempts -1));
                attempts--;
                if(attempts <= 0){
                    System.out.println("Maximum Attempt reached! your account has beed locked");
                    break;
                }
            }
        }
        
        
        
        
    }
}
