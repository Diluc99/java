import java.util.Scanner; 
 
public class BasicCalculator {    
 public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 
 
        // Basic Calculator 
        System.out.print("Enter first number: ");         double number1 = scanner.nextDouble();         System.out.print("Enter second number: ");         double number2 = scanner.nextDouble(); 
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                + number1 + " and " + number2 + " is " 
                + (number1 + number2) + ", " + (number1 - number2) + ", " 
                + (number1 * number2) + ", and " + (number1 / number2)); 
                scanner.close(); 
            } 
        } 
        