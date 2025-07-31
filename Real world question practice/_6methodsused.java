

import java.util.*;
public class _6methodsused {
     static Scanner sc = new Scanner(System.in);
     static int totalBill = 0;



    public static void main(String[] args){
        String choice; 
        
        do{
            displayMenu();
            takeOrder();
            System.out.println("Do you want to order more? (yes/no): ");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("yes"));

            calculateBill();


            
}
         static void displayMenu(){
                System.out.println("===MENU====");
                System.out.println("1.Pizza - 100");
                System.out.println("2.burger - 150");
                System.out.println("3.Coke - 200");
                System.out.println("4.Coffee - 250");
                System.out.println("================");

            }









}