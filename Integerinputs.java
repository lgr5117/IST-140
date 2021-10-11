/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerinputs;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class Integerinputs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /**
      * Create a new Java application called IntegerInputs to prompt the user to enter a sequence of positive integers.  
      * Use a while loop with -1 as the sentinel.
      * Determine the smallest number
      * Determine the largest number
      * Accumulate the total
      * Then, output the total, the smallest, and the largest number with the appropriate text.
      * For example: The total is XX.  The largest number is YY and the smallest number is ZZ.
      */
// TODO code application logic here
  
System.out.println("Enter a sequence of positive integers. To end the sequence, type -1 to end sequence");  //prompting user to enter a sequence and to end the sequence with -1 
     
     int largestNum = 0;  //declaring largestNum as an integer and assigning it to 0
     int smallestNum = 0;  //declaring smallestNum as an integer and assigning it to 0
     int inputValue = 0;   //declaring inputValue as an integer and assigning it to 0
     int totalValue = 0;    //declaring totalValue as an integer and assigning it to 0
     
     boolean first = true;   
    
     Scanner scnr = new Scanner(System.in); 
     while(inputValue != -1)  //setting -1 to be the sentinel; as long as this is not -1, this can be considered the first time through
     {
         if(inputValue>=0) //numbers >=0 will not be included in the total, smallest, and largest but also will not kill the sequence, only the sentinel -1 will 
         {
         totalValue = totalValue + inputValue;  //adding every input >=0 to the total value each iteration
         }
         
         if(first)  //if this is the first time through...
         {
             inputValue = scnr.nextInt(); //inputValue is = to the users input
           
           if(inputValue>=0)   //if the user input >=0...
           {
             largestNum = inputValue;   //.... the largest number will be assigned to the user input the first iteration
           }
             
             if(inputValue >=0)  //if the user input >=0...
             {
             smallestNum = inputValue; //... the smallest number will be assigned to the user input the first iteration
             }
             
             first = false; //next iteration will not be the first
         }
         
         else //if this is not the first time
         {
             inputValue=scnr.nextInt(); //inputValue is assigned to user input
             
             if (inputValue >= largestNum) //if the inputValue >= than the integer assigned to largestNum...
             {
                 largestNum = inputValue;  //...the most recent input will be assigned to largestNum
             }
             
             if (inputValue <= smallestNum) //if the inputValue <= than the integer assigned to smallestNum..
             {
                 if(inputValue>=0)  //...and if the inputValue is >=0 (positive number)...
                 {
                 smallestNum = inputValue;  //...the most recent input will be assigned to smallestNum
                 }
             }
         }
     }
     System.out.println("The total is " + totalValue + ". The largest number is " + largestNum + ". The smallest number is " + smallestNum + ".");
                 
              
             }
                 
         }
      
 

   
    


