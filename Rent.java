/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

/**
 *
 * @author laurenrross
 */
public class Rent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalMonths;
        int oneSemCost;  //one semester is equivalent to four months
        int twoSemCost;  // two semesters is equivalent to eight months
        int yearCost;    // one year is equivalent to twelve months
        final int MONTHLY_PAYMENT = 500;
        
        totalMonths = 4;                                        //price to live in the apartment for a semester
        oneSemCost = MONTHLY_PAYMENT * totalMonths;             
        
        totalMonths = 8;                                        //price to live in the apartment for two semesters
        twoSemCost = MONTHLY_PAYMENT * totalMonths;
        
        totalMonths = 12;                                       //price to live in the apartment for a year
        yearCost = MONTHLY_PAYMENT * totalMonths;
            
        System.out.println("Downtown Apartment Rent");
        System.out.println("Total Cost for One Semester (4 months): $" + oneSemCost);
        System.out.println("Total Cost for Two Semesters (8 months): $" + twoSemCost);
        System.out.println("Total Cost for a Year (12 months): $" + yearCost);
        
    }
    
}
