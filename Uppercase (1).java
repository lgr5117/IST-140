/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppercase;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class Uppercase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
       * Create a new Java application called Uppercase to prompt the user to enter a string.  
       * Use a for loop to determine if the string entered contains at least 2 uppercase letters. 
       * Output whether or not the requirement has been met.
       */  
    // TODO code application logic here
    int uppercaseTotal = 0; //total amount of uppercase letters, initalizing total amount of uppercase letters at 0
    int lowercaseTotal = 0; //total amount of lowercase letters, initalizing total amount of uppercase letters at 0
    Scanner input = new Scanner(System.in);

   
    String s;  //declaring string 
    System.out.println("Enter a string: ");  //prompting the user to input a string
    s = input.nextLine();       //reading string value from the user
    
    for(int i = 0; i < s.length(); i++)  //initializing; loop iterates as many times as the length of the string; updating
        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
           uppercaseTotal++;   //adding +1 to total amount of uppercase letters
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            lowercaseTotal++;  //adding +1 to total amount of lowercase letters
        }
      if(uppercaseTotal>=2){
          System.out.println("Requirement has been met. " + uppercaseTotal + " uppercase letters total.");
      }
      else{
          System.out.println("Requirement has not been met." + uppercaseTotal + " uppercase letters total.");
            
        }
        
                
            
            
            
            
        
        
    }
    
    
    
    
    }
    
