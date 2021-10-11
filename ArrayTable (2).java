/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytable;

/**
 *
 * @author laurenrross
 * 
 * Create a new Java program using a 2D array, size is 4 rows and 5 columns.
 * Fill the array with the power of numbers from 1 to 4. 
 * For example, the second row contains 2 4 8 16 32. 
 * Use calculations to determine the values.
 * Print the contents of the array as a table.
 * (Be sure to have even spacing/formatting in the table)
 */
import java.util.Arrays;
public class ArrayTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][]powerNums = new int [4][5]; //4 rows 5 columns

       for(int i=0; i<4; i++) //filling rows
       {
           int numVal = (i + 1); // filling numbers in rows
                
           for(int j=0; j< 5 ; j++)
                 {
                     powerNums[i][j] = numVal; 
                     numVal = numVal * 2;
                  System.out.print(powerNums[i][j] + "\t "); //printing the table and adding a tab between each value
                }
         System.out.println();
        }
      System.out.println();
  
    }
  }



