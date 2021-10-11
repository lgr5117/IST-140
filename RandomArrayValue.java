/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarrayvalue;

/**
 *
 * @author laurenrross
 * Create a new Java program to declare an array of 5 integers.
 * Use a for loop to initialize the array with random numbers (use Math.random) between 10 and 50.
 * Output the values of the array on a single line.
 */
import java.util.Random;
import java.util.Arrays;
public class RandomArrayValue {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int arrayData[] = new int[5]; //declaring and creating an array list of integers with the length of 5
        
        for(int i = 0; i < 5; i++)  //interating 5 times to get 5 random values within the range
        {
          int randomVal = (int)(Math.random() * (50 - 10 + 1)) + 10;  //random value calculation within the range of minimum integer 10 and maximum integer 50
          arrayData[i] = randomVal;
        }
        for( int finalVals : arrayData ) //enhanced for loop 
        {
        System.out.print(finalVals + ", "); //printing list of random values 
        }
        
               
              
        
        
       
    }
    
}
