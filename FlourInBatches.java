/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flourinbatches;

/**
 *
 * @author laurenrross
 */

public class FlourInBatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int requiredCupsFlour;
       int remainingCupsFlour;
       final int INITIAL_CUPS_FLOUR = 11;
       final int CUPS_PER_BATCH = 2;
       final int BATCHES_WANTED = 4;
       
       requiredCupsFlour = BATCHES_WANTED * CUPS_PER_BATCH;                 //total amount of cups of flower required to make 4 batches
       remainingCupsFlour = INITIAL_CUPS_FLOUR % requiredCupsFlour;         //remaining amount of flour after 4 batches were made
       System.out.println("The remaining cups of flour after making 4 batches of cookies is " + remainingCupsFlour + " cups.");
       
               

        



    }
    
}
