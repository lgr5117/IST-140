/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsmallest;

/**
 *
 * @author laurenrross
    Create a Java application called FindSmallest to determine the smallest value entered by the user.
    In the main method, prompt the user for 3 integers.
    Pass those values into a separate method to determine the smallest value.
    Output the smallest value to the console. 
    */
import java.util.*;
public class FindSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); //user input
      System.out.println("Enter three numbers: "); //prompting the user to enter three numbers
      
      double firstUserInput = input.nextDouble();   //declaring the first number the user inputs.
      double secondUserInput = input.nextDouble();  //declaring the second number the user inputs.
      double thirdUserInput = input.nextDouble();   //declaring the third number the user inputs.
      
      System.out.println("The smallest value you entered is: " + smallest(firstUserInput,secondUserInput,thirdUserInput)); 
    } //end main
      
    
    //returning the smallest of the three parameters
   
      public static double smallest(double firstVar, double secondVar, double thirdVar)
      {
    if(firstVar <= secondVar && firstVar <= thirdVar)
    { //if firstVar is less than or equal to secondVar and firstVar is less than or equal to thirdVar...
       return firstVar; //firstVar will be the smallest variable
    }
    else if(secondVar <= firstVar && secondVar <= thirdVar)
    {
        return secondVar; //secondVar will be the smallest variable
    }
    else
    {
        return thirdVar; //thirdVar will be the smallest variable     
    }
               
   }
   }
    
