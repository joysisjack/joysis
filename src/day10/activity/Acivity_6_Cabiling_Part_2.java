
package day10.activity;

import java.util.Scanner;


public class Acivity_6_Cabiling_Part_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table of : " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " *" + j + " = " + (i*j));
            }
        }
    }
}
