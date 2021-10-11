/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowestgrade;

/**
 *
 * @author laurenrross
 * Create a new Java program that for a class that allows students to drop their
 * lowest of 7 quiz grades at the end of the semester. 
 * Prompt the user for these values and add them to an array of integer type.  
 * Sort the array using the sort method from the standard Java library.  
 * Output the student’s average with the lowest score dropped.
 */
import java.util.Scanner;
import java.util.Arrays;
public class LowestGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gradeSum=0;  //initializing the sum of grades to 0
        double gradeAverage=0; //initializing the average of grades to 0
        int[] gradeVal = new int[7]; 
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter 7 quiz grades: "); //prompting the user to enter their grades 
        
        for(int i=0;i<gradeVal.length;i++) //storing user input into the array
        {
            gradeVal[i] = scnr.nextInt();
        }
        
        Arrays.sort(gradeVal); //sorting the grades entered by the user
        System.out.println("Quiz grades after sorting: "+Arrays.toString(gradeVal)); //printing to the user their scores from lowest to highest
        for(int i=1;i<gradeVal.length;i++)  //sorting placed the lowest score at index 0 so it will not be included in the calculations
        {
            gradeSum += gradeVal[i];
        }
        
        gradeAverage = (gradeSum / 6); //dividing the sum by a total of six grades to get the average
        System.out.print("After dropping the lowest quiz grade, the average is: ");
        System.out.printf("%.2f",gradeAverage); //rounding the average to two decimal places
         
    }
    
}
