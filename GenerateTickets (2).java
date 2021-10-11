/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatetickets;

/**
 *
 * @author laurenrross
 * Write a program to generate a list 5 of randomly generated ticket numbers between 50 and 100.  
 * Write this list to a file and read the values from the file.  
 * The main method has already been written for you. 
 * Follow the guidelines below:
    * 1) Method generateTickets:
           * Does not take any parameters. 
           * Returns an array of integers.
           * Using the random number generator, generate 5 numbers between 50 and 100.
           * Store the numbers in an integer array.
    * 2) Method writeToFile:
           * Takes an integer array.
           * Writes the array of integers to a file called tickets.txt
           * Returns the filename.
           * Catches a file not found exception.
    * 3) Method readNumbers:
           * Takes a string (the filename)
           * Reads the file contents into an array list (integer).
           * Catch a file not found exception. 
           * Returns the array list.
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 

public class GenerateTickets {

    /**
     * @param args the command line arguments
     */
    
    public static final int TOTAL_TICKETS = 5;
    
    public static int[] generateTickets() {
   
        Random rand = new Random();
        int arrayTicketValues[] = new int [5]; //array list of 5
        
        for(int i = 0; i<5; i++)
        {
             arrayTicketValues[i] = (int)((Math.random() * (100 - 50)) + 50);
            //System.out.print("Ticket Value: " + arrayTicketValues[i] + "\n");
        }
        return arrayTicketValues;
    }
    
    public static String writeToFile(int arrayTicketValues[]) {
        String fileName ="tickets.txt";
        try 
        {
                FileWriter myWriter;
                myWriter = new FileWriter(fileName);
                
            for(int i=0;i<5;i++)
            {
                myWriter.write(arrayTicketValues[i]+"\n");
            }
            
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
            //return fileName;
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
       return fileName;
    }
    
    public static ArrayList<Integer>readNumbers(String fileName) {
        ArrayList<Integer>readNumber = new ArrayList<>(5);
          try 
          {
            File file = new File(fileName);
            try (Scanner scnr = new Scanner(file)) 
            {
                while (scnr.hasNextLine()) 
                {
                    String data = scnr.nextLine();
                    int data_int = Integer.parseInt(data);
                    readNumber.add(data_int);
                    System.out.println(data);
                }     
            }
           } 
          
          catch (FileNotFoundException e) {
            System.out.println(e.toString());
          }
          
    return readNumber;
    }
    
    public static void main(String[] args) {
      try
        {
            int[] arrayTicketValues = generateTickets();
            String fileName = writeToFile(arrayTicketValues);
            readNumbers(fileName);
        }
    catch(Exception e)
        {
            String errorMsg = e.getMessage();
            System.out.println(errorMsg);
        }
    }
    
}
