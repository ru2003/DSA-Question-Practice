/* Menu-based program where user selects food items, enters quantity, and final bill is calculated.

Use: switch-case for item selection

loop to allow multiple orders

Create methods like:

displayMenu()

takeOrder()

calculateBill()
- by this u can take only 1 order and then close.
with methods u can take multiple orders
*/
import java.util.*;
public class _6Restaurentmenu {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("1.pizzz-100 \n2.Burger-150\n3.fries-200\n4.coke-250\n5.coffee-300");
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
           default:
           System.out.println("Invalid items.");
           return ;
         }
         int total = price * qty;
         System.out.println("total bill is: "+ total);



    }
}
