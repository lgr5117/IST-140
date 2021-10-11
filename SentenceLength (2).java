/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencelength;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class SentenceLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
       System.out.println("Enter String: ");                                       //User input: user choice of string
       String sentence = scnr.nextLine();
       int stringLength = sentence.length();
       System.out.println("Your string has a length of " + stringLength + " characters.");   //String length of the string the user inputted
       
    }
    
}
