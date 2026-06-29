
package day10.activity;

import java.util.Scanner;

public class Activity6_Cabiling_Part_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number :");
        int number = input.nextInt();
        System.out.println("Multiplication table of : " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + " = " + number*i);
        }
    }
}
