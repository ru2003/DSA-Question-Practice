

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

            static void takeOrder() {
                System.out.println("enter item number: ");
                int item  = sc.nextInt();

                System.out.println("enter quantity: ");
                int qty = sc.nextInt();

                int price = 0;

                switch(item) {
                    case 1: price = 100; break;
                    case 2: price = 150; break;
                    case 3: price = 200; break;
                    case 4: price = 250; break;
                    case 5: price = 300; break;
                    default:
                    System.out.println("Invalid item. Skipping...");
                    return ;
                }

                int currentTotal = price * qty;
                totalBill += currentTotal;
                System.out.println("Item added. SubTotal : Rs" + currentTotal);
            }
            
            








}