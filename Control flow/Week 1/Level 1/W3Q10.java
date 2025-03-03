/*Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value */
import java.util.Scanner;
public class W3Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        double total=0.00;
        double num=scn.nextDouble();
        while (num!=0) {
            total+=num;
            
            System.out.println("Enter num: ");
            num=scn.nextDouble();
        }
        System.out.printf("Total: %f",total);
        
    }
}
