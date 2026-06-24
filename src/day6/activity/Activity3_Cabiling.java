
package day6.activity;


public class Activity3_Cabiling {
    public static void main(String[] args) {
        // Program 1
        int age = 18;
        boolean hasValidID = true;
        
        if(age >= 18 && hasValidID){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
        // End of program 1
        
        //Program 2
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        if(isWeekend || isHoliday){
            System.out.println("No Classed Today!");
        }else{
            System.out.println("Pasok na boi!!!...");
        }
        //End of program 2
        
        //Program 3
        int score = 74;
        String remarks = score >= 75 ? "Passed!" : "Failed";
        System.out.println(remarks);
        // End of program 3
         
         //Program 4
         int num1 = 10, num2 = 25;
         int largestNumber = num1 > num2 ? num1 : num2;
         System.out.println("The Largest Number is : " + largestNumber);
         //End of program 4
         
         //Program 5 - Strecht Program
         int number = 25;
         if(number % 2 == 0){
             System.out.println("The number is even");
         }else{
             System.out.println("The number is odd");
         }
         
        
    }
}
