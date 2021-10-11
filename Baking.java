/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baking;

/**
 *
 * @author laurenrross
 */
import java.util.Scanner;
public class Baking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
         System.out.println("Enter total number of cups of sugar supplied for the day:"); //User input: total sugar
    
         int cakes;
         int pies;
         int cupcakes;
         int cookies;
         
         int totalCupsSugar = scnr.nextInt();
         
         cakes = totalCupsSugar / 5;                   //Total amount of cake that can be made, 5 cups sugar per cake
         totalCupsSugar = totalCupsSugar % 5;          //remaining amount of sugar
         
         pies= totalCupsSugar / 3;                     //Total amount of pie that can be made, 3 cups sugar
         totalCupsSugar = totalCupsSugar % 3;          //remaining amount of sugar
         
         cupcakes = totalCupsSugar / 2;                //Total amount of cupcakes that can be made, 2 cups sugar
         totalCupsSugar = totalCupsSugar %2;           //remaining amount of sugar
         
         cookies = totalCupsSugar;                     //Cookies are 1 cup sugar, last thing made so it will use rest of sugar
         
         System.out.println("Cakes: " + cakes);
         System.out.println("Pies: " + pies);
         System.out.println("Cupcakes: " + cupcakes);
         System.out.println("Cookies: " + cookies);
    }
    
}
