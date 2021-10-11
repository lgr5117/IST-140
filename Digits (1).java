/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digits;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
    Create a Java application called “Digits” (without the quotation marks)
        to request an integer from the user between 0 and 99,999. 
        The program should output whether the user has entered 
        a single digit number, two-digit number, three-digit number,
        four-digit number, five-digit number, 
        or if the value entered is out of range.
        */
        // TODO code application logic here
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter an integer between 0 and 99,999 : ");                         //user input 
     
      int userInput;
      userInput= scnr.nextInt();
      
  if(userInput >= 0 && userInput < 10) {                                                     //numbers greater than or equal to 0 and less than 10 are single digits.
      System.out.println("The number " + userInput + " is a single digit number.");
      }
      else if(userInput >=10 && userInput < 100) {                                           //numbers greater than or equal to 10 and less than 100 are two-digits.
         System.out.println("The number " + userInput + " is a two-digit number.");         
      }
      else if(userInput >= 100 && userInput < 1000) {                                        //numbers greater than or equal to 100 and less than 1,000 are three-digits.
         System.out.println("The number " + userInput + " is a three-digit number.");
      }
      else if (userInput >=1000 && userInput < 10000) {                                      //numbers greater than or equal to 1,000 and less than 10,000 are four-digits.
         System.out.println("The number " + userInput + " is a four-digit number.");
      }
      else if (userInput >=10000 && userInput < 100000) {                                    //numbers greater than or equal to 10,000 and less than 100,000 are five-digits.
        System.out.println("The number " + userInput + " is a five-digit number.");  
      }
      else {                                                                                 //user entered a value not in the range of 0 to 99,999.
        System.out.println("The value " + userInput + " is out of range." );
      }
             
      }
          
   
      }
     
        
   
    
