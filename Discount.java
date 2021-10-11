/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* 
        
     Create a Java application called “Discount” (without the quotation marks)
     to read a customer’s total purchase amount and determine their 
     discount amount based on the total cost.
     Output the user’s discount percentage and the new total with the discount applied.
     $200 or more – discount is 75%
     $100 or more – discount is 50%
     $50 or more – discount is 25%
     Less than $50 – no discount
      
        */  
        // TODO code application logic here
     
        Scanner scnr = new Scanner(System.in);
      System.out.println("Enter total cost including cents: ");
      
      double discount;   //set discounted price
      double moneyOff;   //the result of totalCost multiplied by the discount percentage
      double origCost;   //the original, nondiscounted cost 
      double finalCost;  // the final cost. If a discount was applied, this is origCost - moneyOff
      
      origCost = scnr.nextDouble();
      
      if(origCost >= 50.00 && origCost <= 99.99){     //the original price is greater than or equal to $50.00 and less than or equal to $99.99
          discount = 0.25;   //25% discount
          moneyOff = (origCost * discount);  
          finalCost = (origCost - moneyOff);
          System.out.print("25% discount applied! Your final cost is $"); 
          System.out.printf("%.2f", finalCost);
      }
      else if (origCost >=100.00 && origCost <=199.99){  //the original price is greater than or equal to $100.00 and less than or equal to $199.99
         discount = 0.50;  //50% discount
         moneyOff = (origCost * discount);
         finalCost = (origCost - moneyOff);
         System.out.print("50% discount applied! Your final cost is $"); 
         System.out.printf("%.2f", finalCost); 
      }
      else if (origCost >= 200.00){  //the original price is greater than or equal to $200.00
         discount = 0.75;  //75% discount
         moneyOff = (origCost * discount);
         finalCost = (origCost - moneyOff);
         System.out.print("75% discount applied! Your final cost is $"); 
         System.out.printf("%.2f", finalCost); 
      }
      else{
          System.out.println("No discount applied! Your total cost is still $" + origCost);
   
          
      }
      
      
    }
    
}
