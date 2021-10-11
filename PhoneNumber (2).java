/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonenumber;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
       System.out.println("Type 10 digit phone number:");
      String phoneNumber = scnr.nextLine();
        String area = phoneNumber.substring(0,3);
        String middle_three = phoneNumber.substring(3,6);
         String last_four = phoneNumber.substring(6,10);
         String formatted_phoneNumber = "("+ area + ")" + middle_three + "-" + last_four;
         System.out.println("Phone Number: " + formatted_phoneNumber);
        
        
        
    }
    
}
