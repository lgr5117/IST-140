/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* 
     
     
     Create a Java application called GuessingGame to create a number guessing game.  
     The user can guess any value from 1-10. (You can pick and hard code the correct value).
     The user gets two chances to guess your number correctly.
     If the user’s first guess is correct, tell the user they guessed correctly and end the program.
     If the first guess is incorrect, tell the user if their guess was too high or too low,
     then prompt for another guess.
     If the user’s second guess is correct, tell the user they guessed correctly.
     If the user’s second guess is incorrect, tell the user they guessed incorrectly 
     and give them the correct answer.  


     */
        // TODO code application logic here
      Scanner scnr = new Scanner(System.in);
      System.out.println("You have two chances to a guess the correct number. Enter any value from 1-10: ");        //prompting the user to guess a number between 1-10 where the correct number is four
     
      
      int firstGuess;
      firstGuess = scnr.nextInt();
      
        if(firstGuess == 4) {                                                       //the user guessed the correct number, 4. the game is over now/
            System.out.println("You guessed correctly!");
        }
        
        else{
            if(firstGuess != 4){                                                        //the user guessed a number that was not 4
          
                if(firstGuess > 4 && firstGuess <= 10) {                                //the user guessed a number between 5 and 10
                    System.out.println("Your guess was too high. Try again.");
                 }
                else if (firstGuess >= 0 && firstGuess < 4) {                           //the user guessed a number between 0 and 3
                     System.out.println("Your guess was too low. Try again.");
                 }
            System.out.println("This is your last chance to guess the correct number. Enter any value from 1-10: ");  //since the user guessed wrong, they are promoted with a second chance
         
            int secondGuess;
            secondGuess = scnr.nextInt();
         
             if(secondGuess == 4) {
                    System.out.println("You guessed the number correctly!");               //the user guessed the number 4
              }  
             else{
                    System.out.println("Your guess was incorrect. The correct number was 4.");     //the user did not guess the correct number and was told the correct number.
                 }
            }    
       
          }
      }
}
              
     
      

 
