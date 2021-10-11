/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courselist;

/**
 *
 * @author laurenrross
 * Write a program to get a course list from the user 
 * (be sure to prompt the user for the number of courses)
 * write the list to a file, read the list from that file, and output the new list.  
 * Follow the guidelines below:
    * 1) Write a method called getCourseArray
        * That takes an integer parameter (numCourses) 
        * Returns an array of Strings and is declared to throw an Exception. 
        * If the parameter passed is a negative value, throw an Exception.  
        * Otherwise, loop numCourses times prompting the user to enter another item each pass through the loop.  
        * Return this array of items.
    * 2) Write a method called writeCourses that takes two parameters: 
        * an array of Strings (courseArray)
        * a String (fileName)
        * and returns nothing. 
        * Write the array of Strings (items) to a text file named using the fileName parameter.  
        * Make sure to catch any Exception that might be thrown.
    * 3) Write a method called readCourses 
        * that takes a String parameter (fileName)
        * returns an ArrayList of Strings (itemsArrayList)
        * The method reads the text file (fileName) and populates the ArrayList with an element for each line in the file.  
        * The method returns the populated ArrayList.  
        * Make sure to catch any Exception that might be thrown.
    * 4) Write a method called printList 
        * that takes an ArrayList of Strings 
        * prints the contents of the ArrayList to the command line each on a separate line.
    * 5) Call each of the methods above from the main method. 
    * The pseudocode for the main method is a given below.  
    * Make sure to catch any Exception that might be thrown.
        * Call getCoursesArray passing the size of the array (any integer) that you want returned
        * Pass the array and a file name to the writeItems method
        * Pass the file name to the readItem method and return the ArrayList
        * Pass the ArrayList to the printList method.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseList {

    /**
     * @param args the command line arguments
     */
    public static String[] getCourseArray(int numCourses)throws Exception {
    
        if(numCourses < 0) 
        {
          throw new Exception("Invalid"); //number of courses is invalid if less than 0 
        }
        
        String[] courses = new String[numCourses]; 
        
        Scanner scnr = new Scanner(System.in); //user input
    
        for(int i=0;i<numCourses; i++) 
        {
            System.out.println("Enter Course Name: " + (i+1));
            courses[i] = scnr.nextLine();
        }
       
        return courses;
    }
    public static void writeCourses(String[]courseArray,String fileName) throws IOException {
         
        try 
        {
            FileWriter myWriter;
            myWriter = new FileWriter(fileName);
            for(String items : courseArray){
                myWriter.write(items + "\n");
            }
             myWriter.close();
            //System.out.println("Successfully wrote to the file.");   
        }
        catch (IOException e) {
         System.out.println(e.toString());
        }
    }
    public static ArrayList<String>readCourses(String fileName) throws FileNotFoundException {
        ArrayList<String> itemsArrayList = new ArrayList<String>();
        try 
        {
            Scanner scnr = new Scanner(new File(fileName));
            while(scnr.hasNext()) 
            {
                itemsArrayList.add(scnr.nextLine());
            }
            scnr.close();
        }
    catch (FileNotFoundException e)
    {
         System.out.println(e.toString());
    }
      return itemsArrayList;
    }
    
    public static void printList(ArrayList<String>itemsArrayList) {
        for(String str : itemsArrayList)
        {
            System.out.print(str + "\n");
        }
    }
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) 
        {
            System.out.println("Enter number of courses: ");
            int numCourses = scnr.nextInt();
            //
            String fileName = "items.txt";
            String[] courseArray = getCourseArray(numCourses);
            writeCourses(courseArray,fileName);
            //
            ArrayList<String>itemsArrayList = readCourses(fileName);
            //
            printList(itemsArrayList);
        }
       catch (Exception e)
       {
       System.out.println(e.toString());
       }
    }
    
}
