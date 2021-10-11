/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prices1;

/**
 *
 * @author laurenrross
 * Write a program to validate that the user follows the password policy and throws an exception if the requirements are not met.  
 * If the requirements are met, use a separate method to generate an array of 10 prices that are between 5 and 200.  
 * Write this array to a file and read the values from the file.  
 * Follow the guidelines below:
    1) Method validatePassword:  
        * Password length must be at least 4 characters
        * Have at least one upper case letter
        * At least one digit.
        * Throw an exception if the password does not meet the requirements.
    2) Method generatePrices: 
        * Does not take any parameters and returns an array of integers.
        * Using the random number generator, generate 10 numbers between 5 and 200.
        * Store the numbers in an integer array. 
        * Print the array to the console.
    3) Method writeToFile:
        * Takes an integer array and writes the array of integers to a file called prices.txt.
        * The method should return the filename and catch any Exception that might be thrown.
    4) Method readPrices:
        * Takes a string (the filename) and reads the file contents into an ArrayList (integer).
        * The method should catch a file not found exception, output the ArrayList and return the ArrayList.
    5) Call each of the methods above from the main method. 
       The pseudocode for the main method is a given below.
       Make sure to catch any Exception that might be thrown.
        * Call validate password method
        * Call generate prices method
        * Call write to file method and pass the array of price data
        * Call read numbers method and pass the file name
        * Catch any Exception that might be thrown
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
public class Prices1 {

   /**
     * @param args the command line arguments
     */
    
    public static final int PASSWORD_CHARACTERS = 4; //finalizing the amount of characters in the password
    
    public static boolean validatePassword(String password) { //declaring a method to validate a password
       try{
        if(password.length() < PASSWORD_CHARACTERS) //if the password entered by the user is less than 4
       {
           //return false;
           throw new Exception("Too Short"); //password does not meet length requirements
       }
    
       int uppercaseTotal = 0; 
       int lowercaseTotal = 0;
       int numTotal = 0;
  
        for(int i = 0; i < password.length(); i++) 
        {
            char ch = password.charAt(i);
        if(password.charAt(i)>='A' && password.charAt(i)<='Z') 
        {
           uppercaseTotal++;   //adding +1 to total amount of uppercase letters
            }
            else if(password.charAt(i)>='a' && password.charAt(i)<='z')
            {
            lowercaseTotal++;  //adding +1 to total amount of lowercase letters
        }
         if(Character.isDigit(password.charAt(i))) 
         {
             numTotal++;
                    
         }

     } 
        if (uppercaseTotal >= 1 && lowercaseTotal >=1 && numTotal >= 1)
        {
           return true;
        }
        else
        {
           throw new Exception("Needs upper/lower,etc.");
        }
       }
       catch(Exception e)
       {
           return false;
       }
    }
    
    public static int[] generatePrices()
    {
    
        Random rand = new Random();
        int prices[] = new int [10]; //array list of 10
        
        for(int i = 0; i<10; i++)
        {
             prices[i] = (int)((Math.random() * (200 - 5)) + 5);
            System.out.print("Prices: " + prices[i] + "\n");
        }
        return prices;
    }


     public static String writeToFile(int prices[]) 
    {
        String fileName ="prices.txt";
        
        try 
        {
                FileWriter myWriter;
                myWriter = new FileWriter(fileName);
                
            for(int i=0;i<10;i++)
            {
                myWriter.write(prices[i]+"\n");
            }
            
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
            return fileName;
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
      return fileName;
    }
    
    public static ArrayList<Integer>readPrices(String fileName)
    {
        ArrayList<Integer>readPrice = new ArrayList<>(10);
          try {
      File file = new File(fileName);
           
        try (Scanner scnr = new Scanner(file)) {
                while (scnr.hasNextLine()) {
                    String data = scnr.nextLine();
                    int data_int = Integer.parseInt(data);
                    readPrice.add(data_int);
                    System.out.println(data);
                }     
        }
    } 
          catch (FileNotFoundException e) 
          {
             System.out.println(e.toString());
          }
    return readPrice;
  
  }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Password Policy: Must be at least 4 characters, have at least one upper case letter, and at least one digit.");
        
         try
            {
        String userInput = scnr.nextLine();
        if(validatePassword(userInput))
        {
            
            System.out.println("You follow the password policy");
            //
           
            int prices[] = generatePrices();
            writeToFile (prices);
            //
            ArrayList<Integer> readPrice = readPrices("prices.txt");
            System.out.println(readPrice);

        }
        else 
        {
           
         System.out.println("Password does not follow the policy");
                 
        } 
    }
        catch (Exception e)
           {
               System.out.println(e.toString());
           }
    }
    
}
