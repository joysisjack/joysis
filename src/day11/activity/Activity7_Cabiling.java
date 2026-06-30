
package day11.activity;

import java.util.Scanner;

public class Activity7_Cabiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // This is me being playful on my code :D 
        
        // Getting a dynamic array size
        System.out.print("Enter Array Size: ");
        int size = input.nextInt();
        int largestNumber , lowestNumber , sum = 0;
        
        // initialize array with dynamic size based on user input
        int[] numbers = new int[size];
        
        // Getting all users input numbers
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i+1) + " :");
            numbers[i] = input.nextInt();
        }
        // Initialzed lowest and largerst number at the first value on the array
        largestNumber = numbers[0];
        lowestNumber = numbers[0];
        System.out.println("----------------------");
        
        // Printing all value on array + finding the lowest and largest value and sum of all numbers
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Index " + i + " :" + numbers[i]);
            sum += numbers[i];
            
            if(numbers[i] >= largestNumber){
                largestNumber = numbers[i];
            }
            if(numbers[i] <= lowestNumber){
                lowestNumber = numbers[i];
            }
        }
       
        
        // Printing all output needed
        System.out.println("The sum of all numbers : " + sum);
        // Printing average of all elements on the array with data type casting to double so decimal will displayed
        System.out.println("The average of all numbers on the array is : " + (double) sum / numbers.length);
        System.out.println("The largest number on array is : " + largestNumber);
        System.out.println("The lowest number on array is : " + lowestNumber);
        
        
    }
}
