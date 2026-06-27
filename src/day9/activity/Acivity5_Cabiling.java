package day9.activity;

import java.util.Scanner;

public class Acivity5_Cabiling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, product = 1;
        System.out.println("=====Day 9 Activity=====");
        System.out.println("1. Activity 5.1 Summation of 1 to N");
        System.out.println("2. Activity 5.2 Product of 1 to N");
        System.out.println("3. Activity 5.3 Arithmetic Sequence (Sum Only)");
        System.out.println("4. Activity 5.4 Arithmetic Sequence (Sum and Product)");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                // Activity 5.1
                System.out.print("Enter Number : ");
                number = input.nextInt();
                for (int i = 1; i <= number; i++) {
                    System.out.println("i = " + i + ", sum = " + (sum += i));
                }
                System.out.println("Final Sum : " + sum);
                break;
            case 2:
                // Activity 5.2

                System.out.print("Enter Number : ");
                number = input.nextInt();
                for (int i = 1; i <= number; i++) {
                    System.out.println("i = " + i + ", product = " + (product *= i));
                }
                System.out.println("Final Product : " + product);
                break;
            case 3:
                // Activity 5.3
                int startNumber,
                 commonDifference,
                 loopCount,
                 total=0;
                System.out.print("Enter Starting Number : ");
                startNumber = input.nextInt();
                System.out.print("Enter Common Difference Number : ");
                commonDifference = input.nextInt();
                System.out.print("Enter Loop Count: ");
                loopCount = input.nextInt();

                for (int i = 1; i <= loopCount; i++) {
                    System.out.print(startNumber);
                    total += startNumber;

                    if (i < loopCount) {
                        System.out.print(" + ");
                    } else {
                        System.out.print(" = " + total);
                    }

                    startNumber += commonDifference;
                }
                System.out.println("");
                break;
            case 4:
                // Activity 5.4
                int startNumberAct4,
                 commonDifferenceAct4,
                 loopCountAct4,
                 sumAct4 =0,
                 productAct4 = 1,
                 startNumberTemp;
                System.out.print("Enter Starting Number : ");
                startNumber = input.nextInt();
                startNumberTemp = startNumber;
                System.out.print("Enter Common Difference Number : ");
                commonDifference = input.nextInt();
                System.out.print("Enter Loop Count: ");
                loopCount = input.nextInt();
                System.out.print("Sum : ");
                for (int i = 1; i <= loopCount; i++) {
                    System.out.print(startNumber);
                    sumAct4 += startNumber;
                    
                    if (i < loopCount) {
                        System.out.print(" + ");
                    } else {
                        System.out.print(" = " + sumAct4);
                    }

                    startNumber += commonDifference;
                }
                System.out.println("");
                
                System.out.print("Product : ");
                for (int i = 1; i <= loopCount; i++) {
                    System.out.print(startNumberTemp);
                    productAct4 *= startNumberTemp;
                    
                    if (i < loopCount) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" = " + productAct4);
                    }

                    startNumberTemp += commonDifference;
                }
                System.out.println("");
                break;
        }

        input.close();

    }
}
