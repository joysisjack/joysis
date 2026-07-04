
package day13.acivity;

public class Acivity10_Cabiling {
    public static void main(String[] args) {
        double number = 22.89;
        double negativeValue = -22.83;
        
        //Math.abs() - Returns Abosulte value of a number (Positive)
        System.out.println("The Abosolute Value of " + negativeValue + " is : " + Math.abs(negativeValue));
        
        //Math.max() - Returns the larger of two values.
        System.out.println("The Larger number between 80 & 90 is : " + Math.max(80, 90));
        
        // Math.min() - Returns the lowest of two values.
        System.out.println("The Lowest number between 80 & 90 is : " + Math.min(80, 90));
        
        // Math.pow() - Returns the value of a number raised to a power
        System.out.println("The 2 raise  to a power of 3 is " + Math.pow(2, 3));
        
        // Math.sqrt() - Return square root value of a number
        System.out.printf("The Square root of " + number + " is %.2f%n" , Math.sqrt(number));
        
        // Math.round() - Rounds a decimal to the nearest whole number
        System.out.println("Round of a 15.6 : " + Math.round(15.6));
        System.out.println("Round of a 15.4 : " + Math.round(15.4));
        
        // Math.ceil() - Rounds up the decimal to the nearest whole number
        System.out.println("The Ceil value of a 15.6 : " + Math.ceil(15.6));
        
        // Math.floor() - Rounds down the decimal to the nearest whole number
        System.out.println("The Floor value of a 15.6 : " + Math.floor(15.6));
        
        // Math.random() - Return a random double value from 0.0 to 1.0
        System.out.printf("Random number : %.2f%n" , Math.random());
        
        // Math.log() - Returns the natural logarithm (base e) of a number.
        System.out.printf("I don't know what is this :P %.2f%n" , Math.log(10));
        
        // Math.log10() - Returns the base-10 logarithm of a number.
        System.out.printf("I don't know what is this either :P  %.2f%n" , Math.log10(10));
        
        // Math.exp() - Returns e raised to the specified power.
        System.out.printf("Hahahaha : %.2f%n" , Math.exp(3));
        
        // Math.sin() - Returns the sine of an angle in radians.
        System.out.printf("?? : %.2f%n" , Math.sin(3));
        
        // Math.cos() - Returns the cosine of an angle in radians.
        System.out.printf("?? : %.2f%n" , Math.cos(3));
        
        // Math.tan() - Returns the tangent of an angle in radians.
        System.out.printf("?? : %.2f%n" , Math.tan(3));
    }
}
