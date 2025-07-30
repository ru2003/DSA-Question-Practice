/* Menu-based program where user selects food items, enters quantity, and final bill is calculated.

Use: switch-case for item selection

loop to allow multiple orders

Create methods like:

displayMenu()

takeOrder()

calculateBill()*/
import java.util.*;
public class _6Restaurentmenu {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("1.pizzz \n2.Burger\n3.fries\n4.coke\n5.coffee");
         System.out.println("Enter item number: ");
         int item = sc.nextInt();

         System.out.println("Enter the quantity.");
         int qty = sc.nextInt();
        
         int price = 0;
         switch(item){
            case 1: price = 100; break;
            case 2: price = 150; break;
            case 3: price = 200; break;
            case 4: price = 250; break;
            case 5: price = 300; break;

         }



    }
}
