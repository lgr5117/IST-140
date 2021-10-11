/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalpricearraylist;

/**
 *
 * @author laurenrross
 * Create a new Java program that uses a ArrayList of type double to store sale values entered by the user.  
 * Prompt the user to enter 4 prices.  
 * Use a for loop to get the values from the user and add them to the array.  
 * Use another for loop to calculate the sum of the values.
 * Print the sum to the console.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TotalPriceArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       final int NUM_ELEMENTS = 4;  // number of elements (prices) in the array list
       
       Scanner scnr = new Scanner(System.in); 
       ArrayList<Double>userVals = new ArrayList<Double>(); //store sale values entered by the user
       
       int i; //loop index
       
       double sumVal= 0.0; //for calculating the sum and setting at 0.
       
       System.out.println("Enter four prices:");
       
       for(i=0;i < NUM_ELEMENTS; i++)  //running the loop four times for four user entries
       {
           userVals.add(scnr.nextDouble());
       }
       
       for(i=0; i<userVals.size(); i++)  //adding each user entry from the array list to the sumVal
       {
           sumVal = sumVal + userVals.get(i);
       }
       System.out.print("Sum of Prices: $"); //printing the sum to the second decimal place
         System.out.printf("%.2f",sumVal);
           
       }
    }
    
