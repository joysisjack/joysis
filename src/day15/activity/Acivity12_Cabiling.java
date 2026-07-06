package day15.activity;

import java.util.Scanner;

public class Acivity12_Cabiling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String name;
        System.out.println("----- Acivity 12 -----");
        System.out.println("1 . Get Odd or Even");
        System.out.println("2 . Printing names 50 times");
        System.out.println("3 . Get Square root of a number");
        System.out.println("4 . Get Power of a Number");
        System.out.println("5 . Generate random number (1-100)");
        System.out.println("6 . Get Area of a circle");
        System.out.println("7 . Voter's Checker");
        System.out.println("8 . Get lenght of a word");
        System.out.println("9 . Print word in reverse order");
        System.out.println("10 . Printing fullname and age");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("-- Odd or Even --");
                System.out.print("Enter Number : ");
                num = input.nextInt();
                System.out.println("The number is : " + getOddOrEven(num));
                
                break;
            case 2:
                input.nextLine();
                System.out.println("-- Printing name 50 times --");
                System.out.print("Enter name : ");
                name = input.nextLine();
                printingNames(name);
                break;
            case 3:
                System.out.println("-- Get a Square root of a number --");
                System.out.print("Enter number : ");
                num = input.nextInt();
                System.out.print("The squre root of " + num + " is ");
                System.out.printf("%.2f%n" , getSquareRoot(num));
                break;
            case 4:
                System.out.println("-- Get Power of a number --");
                System.out.print("Enter base number : ");
                int base = input.nextInt();
                System.out.print("Enter Exponent : ");
                int exponent = input.nextInt();
                System.out.print("The "  + base + " raise to the power of " + exponent + " is : ");
                System.out.printf("%.2f%n" , getPower(base,exponent));
                break;
            case 5:
                System.out.println("-- Generate random Number (1-100)");
                System.out.println("The Generated number is : " + generateRandomNumber());
                break;
            case 6:
                System.out.println("-- Get an area of a circle --");
                System.out.print("Enter radius : ");
                num = input.nextInt();
                System.out.print("The are of " + num + " is ");
                System.out.printf("%.2f%n", getArea(num));
                break;
            case 7:
                System.out.println("-- Voter's checker --");
                System.out.print("Enter age : ");
                num = input.nextInt();
                System.out.println("Is registered? Y / N");
                input.nextLine();
                boolean isRegistered = false;
                char ch = input.nextLine().charAt(0);
                if(ch == 'Y' || ch == 'y'){
                    isRegistered = true;
                }else{
                    isRegistered = false;
                }
                System.out.println("The information you entered is a : " + votersChecker(num, isRegistered));
                break;
            case 8:
                input.nextLine();
                System.out.println("-- Get a length of a word --");
                System.out.print("Enter a word : ");
                String words = input.nextLine();
                System.out.println("The length is : " + getWordLength(words));
                break;
            case 9:
                input.nextLine();
                System.out.println("-- Printing word in reverse order --");
                System.out.print("Enter a word: ");
                String word = input.nextLine();
                reverseWord(word);
                break;
            case 10:
                input.nextLine();
                System.out.println("-- Printing Names and age --");
                System.out.println("Enter Name: ");
                String fullName = input.nextLine();
                System.out.print("Enter Age: ");
                int age = input.nextInt();
                getDetails(fullName, age);
                break;
            default:
                System.out.println("Invalid choice! please try again!");
                break;
                
                
                
        }
    }

    public static String getOddOrEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void printingNames(String name) {
        for (int i = 0; i < 50; i++) {
            System.out.println(name);
        }
    }

    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public static int generateRandomNumber(){
        double generatedNumber = Math.random() * 100;
        return (int) generatedNumber;
    }
    public static double getArea(int radius){
        double area = Math.PI * radius * radius;
        return area;
    }
    public static String votersChecker(int age, boolean isRegistered){
        return (age >= 18 && isRegistered) ? "Voters" : "Not Voter";
    }
    public static int getWordLength(String word){
        return word.length();
    }
    public static void reverseWord(String word){
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println("");
    }
    public static void getDetails(String name, int age){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " yrs old");
    }
}
