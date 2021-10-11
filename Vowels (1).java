/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*
Create a Java program to request a single letter from the user. 
Use a switch case statement to determine if the letter entered
by the user is a vowel (a, e, i, o, u). 
If the user does not enter a vowel,
use a default case to tell the user they entered a consonant. 
Assume the user enter a lowercase letter.   
*/
        // TODO code application logic here
          Scanner scnr = new Scanner(System.in);
       System.out.println("Enter a single character: ");   //user input
   
       String entry = scnr.next();
      char userChar = entry.charAt(0);
      userChar = Character.toLowerCase(userChar);          //making user input lowercase
       
      if(userChar >= 'a' && userChar <= 'z') {             //limiting to characters from/including a to z
          switch(userChar) {
            case 'a':                                      //user enters letter 'a'
            System.out.println("The letter " + userChar + " is a vowel");     
            break;
            
            case 'e':                                      //user enters letter 'e'
            System.out.println("The letter " + userChar + " is a vowel.");  
            break;  
            
            case 'i':                                      //user enters letter 'i'
            System.out.println("The letter " + userChar + " is a vowel.");  
            break;
            
            case 'o':                                      //user enters letter 'o'
            System.out.println("The letter " + userChar + " is a vowel.");  
            break;
            
            case 'u':                                      //user enters letter 'u'
            System.out.println("The letter " + userChar + " is a vowel."); 
            break;
            
            default:
            System.out.println("The letter " + userChar + " is a consonant.");     //the user did not enter the letter 'a' 'e' 'i' 'o' or 'u'
            break;
    }
    
}
      else {
          System.out.println ("Invalid Input: " + userChar + " is not a single letter.");   //the user did not enter a single letter from the alphabet
                  
      }
    }
}

