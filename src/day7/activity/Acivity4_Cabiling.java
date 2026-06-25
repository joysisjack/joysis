
package day7.activity;

import java.util.Scanner;


public class Acivity4_Cabiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======= Main Menu =======");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4) : ");
        int choice = input.nextInt();
        if(choice == 1){
            System.out.println("You selected option 1 : Start Game");
        }else if(choice == 2){
            System.out.println("You selected option 2 : Load Game");
        }else if(choice == 3) {
            System.out.println("You selected option 3 : Settings");
        }else if(choice == 4){
            System.out.println("You selected option 4 : Exit");
        }else{
            System.out.println("Invalid choice. Please try again.");
        }
        
        input.close();
    }
}
