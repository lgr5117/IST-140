/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterest;

/**
 *
 * @author laurenrross
 * Create a Java application called CompoundInterest. 
 * From the main class, prompt the user to enter an initial bank account balance, an interest rate, 
 * number of compoundings per year, and the number of years.
 * Code a method that receives these values and computes the balance of a bank account.
 * Return the ending value to main and output it.
 * The equation for compounding interest is: A = P(1 + r/n)^nt
 * where:
 *  A is the ending amount
 *  P is the beginning amount (or principal)
 *  r is the interest rate (expressed as a decimal)
 *  n is the number of compoundings a year
 *  t is the total number of years
*/
import java.util.*;
public class CompoundInterest {
    public static double calcCompoundInterest(double P , double r , int n , int t){ //P is the initial amount of money, r is the interest rate as a decimal, n is the total amount of compoundings per year and t is how many years total
        double A; //A is the ending amount and expressed as a decimal
        return A = P * (Math.pow((1+(r * (0.01 / n))),(n * t))); // The equation for compounding interest is: = P(1 + r/n)^nt
    } //end of calcCompoundInterest
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

   double P;    //expressing the principal/beginning amount (variable P) as a decimal by declaring it as double.
   double r;    //expressing interest rate (variable r) as a decimal by declaring it as double. 
   int n;       //number of compoundings per year as variable n and as an integer.
   int t;       //total number of years as variable t and as an integer.
   
   Scanner input = new Scanner(System.in); //input by the user
   
   System.out.println("Enter initial bank account account balance: "); //prompting user to enter their beginning amount of their bank balance.
   P = input.nextDouble();  //P is set to user input
   
   System.out.println("Enter your interest rate as a decimal: "); //prompting the user to enter their interest rate as a decimal.
   r = input.nextDouble(); //r is set to user input
   
   System.out.println("Enter the number of compounds per year: "); //prompting the user to enter the total number of compoundings per year.
   n = input.nextInt(); //n is set to user input
   
   System.out.println("Enter the total number of years: "); //prompting the user to enter the total number of years.
   t = input.nextInt(); //t is set to user input
   
   double A = calcCompoundInterest(P,r,n,t);    //expressing the ending amount (variable A) as a decimal by declaring it as double.      
   System.out.print("Your ending amount is: $"); //outputting the user's total ending amount to two decimal places.
   System.out.printf("%.2f",A);
   
    } //end of main
   
}
