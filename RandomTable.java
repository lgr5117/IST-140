/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomtable;

/**
 *
 * @author laurenrross
 */
import java.util.Random;
public class RandomTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Create a new Java application called RandomTable. 
         * Use nested for loops to print 3 rows of 5 randomly generated integers between 0 and 9 inclusive.
         * Consider what Math function could be used in this scenario.
         */
        
// TODO code application logic here
    for(int row = 0; row < 3; row++){  // creating three rows 
        for(int column = 0; column < 5; column++){  // creating five columns
                   
            System.out.print((int)(Math.random() * (9 - 0 + 1) + 0) + " "); // use the equation (b-a+1)+a for limits 
        }
        System.out.println();
            
    }
    }
    
}
