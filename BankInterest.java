/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinterest;

/**
 *
 * @author laurenrross
 * A bank allows the customer to make as many deposits as they’d like. 
 * If the user’s total balance is at least $10,000, the user receives an interest rate of 2.5%. 
 * Determine the user’s current balance after interest.  
 * Code the following methods:
        1 ) A method that takes no parameters and returns an ArrayList of doubles. 
        *   Ask the user to enter a list of deposits.  They can enter as many vales as they like.  
        *   The method returns these in the ArrayList.
        * 
        2 ) A method that takes an ArrayList of doubles as a parameter and returns a double value. 
        *   Find the sum of the values within the arraylist and return the total value.
        * 
        3 ) A method that takes a double value as a parameter and returns nothing. 
        *   If the user’s total balance is at least $10,000, calculate their new total balance with the interest added.  
        *   If the user’s total balance is less than $10,000, output the user’s total balance without interest.  
        *   Be sure to format your output.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class BankInterest {

    /**
     * @return 
     */
    
//Part 1: A method that takes no parameters and returns an ArrayList of doubles. 
    public static ArrayList<Double>userDeposits() { //start of method
        Scanner scnr = new Scanner(System.in);  //user input
        ArrayList<Double>enteredDeposits = new ArrayList<Double>(); //store enteredDeposits by the user
        double depositValue ;  //initializing as a double 
      
        do{                                                                      //reference do-while loop from mod4 clerkdiscount
            System.out.println("Enter your deposits. Enter 0 to end sequence."); //prompting the user to enter as many deposits values as they would like and using 0 as the sentinel
        depositValue = scnr.nextDouble(); //user input from scanner is set to the to the user input
            if (depositValue > 0) //if the deposit value entrered by the user is greater than 0 add value to the array list
            {
                enteredDeposits.add(depositValue); //adding to array list
            }
        }
       while (depositValue > 0); 
       
       return enteredDeposits; //the method returns these in the ArrayList.
    } //end of method
 
//Part 2: A method that takes an ArrayList of doubles as a parameter and returns a double value. 
    public static double sumDepositVal(ArrayList<Double>enteredDeposits) { //start of method
        double totalValue = 0; //sum of deposits initialized as a double and set at 0 
        
        for(double sumDeposits : enteredDeposits ) //enhanced for loop; finding the sum of the values within the arraylist 
        { 
            totalValue += sumDeposits; //calculating sum
        }
        return totalValue; // return the total value
    } //end of method
 
//Part 3: A method that takes a double value as a parameter and returns nothing. 
    public static void totalBalanceVal(double totalBalance) { //start of method If the user’s total balance is at least $10,000, calculate their new total balance with the interest added.  
    
    double userTotalBalance = totalBalance; 
    double interestRate = (0.025); //interest rate is at 2.5% 
    double userInterest; //initializing user interest as a double
    
    if(totalBalance >= 10000.00) //If the user’s total balance is at least $10,000, calculate their new total balance with the interest added.  
    {
        userInterest = totalBalance * interestRate; //user interest is equal to the total balance multipled by 0.025
        userTotalBalance += userInterest; //adding interest to the users total
        System.out.print("You deposited a total of: $"); //printing the amount the user deposited
        System.out.printf("%.2f",totalBalance); //rounding to second decimal
        System.out.println(""); //creating new line for formatting
        System.out.print("The total interest you earned: $"); //printing the amount of interest earned
        System.out.printf("%.2f",userInterest);
        System.out.println(""); //creating new line for formatting
        System.out.print("Your new and updated total balance with interest added: $"); //printing new total balance with the interest added
        System.out.printf("%.2f",userTotalBalance);
    }
      else{ //If the user’s total balance is less than $10,000, output the user’s total balance without interest.  
       System.out.print("You deposited a total of: $"); //printing the amount the user deposited
       System.out.printf("%.2f",totalBalance); //rounding to second decimal
     }   
    }//end of method.

    public static void main(String[] args) { //start of method
        ArrayList<Double>enteredDeposits = userDeposits(); 
        double totalVal = sumDepositVal(enteredDeposits);
        totalBalanceVal(totalVal);
    } //end of method
    
}
