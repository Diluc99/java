/* Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result

*/
import java.util.Scanner;

import java.util..Scanner;
public class W3Q12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        int userInput=scn.nextInt();
        while(userInput>0){
            int sumLoop=0;
            sumLoop+=userInput;
            userInput--;
        }
        int sum = (userInput*(userInput+1)/2);
        
    }
}
