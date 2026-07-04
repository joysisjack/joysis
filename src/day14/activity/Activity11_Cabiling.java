package day14.activity;

import java.util.Scanner;

public class Activity11_Cabiling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lottoResult = new int[6];

        while (true) {
            System.out.println("------- Lotto Number Generator -------");
            System.out.println("1 . Generate Number");
            System.out.println("2 . View Numbers");
            System.out.println("3 . Exit");
            System.out.print("Enter Choice : ");
            int choice = input.nextInt();

            if (choice == 1) {
                for (int i = 0; i < 6; i++) {

                    double generatedNumber = (Math.random() * 58);
                    int roundedNumber = (int) generatedNumber;
                    if (lottoResult[i] == roundedNumber) {
                        System.out.println("Numbers Duplicated Generating new number ..\n");
                        double newlyGeneratedRandomNumber = (Math.random() * 58);
                        int newlyGeneratedNumber = (int) newlyGeneratedRandomNumber;
                        lottoResult[i] = newlyGeneratedNumber;
                    } else {
                        lottoResult[i] = roundedNumber;

                    }

                }
                System.out.println("Lotto number Generated!");
            } else if (choice == 2) {
                System.out.print("The generated numbers are : ");
                for (int result : lottoResult) {
                    System.out.print( + result + ", ");
                }
                System.out.println("");
                System.out.println("");
            }else if (choice == 3){
                break;
            }else{
                System.out.println("Invalid Choice please try again!");
            }

        }

    }
}
