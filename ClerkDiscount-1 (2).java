/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clerkdiscount;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class ClerkDiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Create a new Java application called ClerkDiscount that prompts a clerk
         * for the price of each item purchased by the customer and calculate their total. 
         * 
         * Use a do while loop to allow for the clerk to enter as many items as necessary.  
         * 
         * Use 0 as a sentinel. 
         * 
         * If the customer spends at least $50, they receive a 15% discount. 
         * 
         * If the customer qualifies for the discount,
         * output a statement informing them of this 
         * as well as their new total with the discount applied.  
         * 
         * If the customer does not qualify, only output their total.  
         * 
         * Be sure to format your output.
         */
// TODO code application logic here
    double itemPrice;  //intializing item price of the items purchased by the customer
    
    double totalCost;  //initalizing customer's total cost
    totalCost = 0.00;   //setting total cost initially to $0.00
    
    double moneyOff; //the money subtracted from the total cost due to the 15% discount, multiplying total cost by 0.15
    double discountedTotal; //the final cost after the discount
    
     Scanner input=new Scanner(System.in); //input
     
    do{
        System.out.println("Enter total price of item purchased (including cents). Enter 0 to stop.: "); //prompting the suer to input value of an item purchased
         itemPrice=input.nextDouble(); //input from scanner
         totalCost = itemPrice + totalCost; //adding the price of the item to the customers total cost
    }
    while(itemPrice != 0.00);  //item price is not equal to 0.00, ending loop at 0.00
        if(totalCost>= 50.00){  //if the total cost is greater than or equal to $50.00 the customer qualifies for a 15% discount
            System.out.println("You qualify for a 15% discount!"); //informing to the customer about discount
            moneyOff = totalCost * 0.15;  
            discountedTotal = totalCost - moneyOff;
            System.out.print("Your new total cost with the discount applied is: $" );  //outputting total cost with discounted price to customer 
            System.out.printf("%.2f", discountedTotal);   //rounding to the nearest cent
        }  
        else{  //the customer spent less than $50.00 and is not elligble for a discount
            System.out.println("Your total cost is:$" + totalCost);  //outputting total cost to the customer
            }
    }
   }
