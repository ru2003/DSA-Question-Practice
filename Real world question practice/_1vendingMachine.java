import java.util.*;
/*Concepts used: switch-case, if-else, loops, arrays

🧠 Use Case: Simulate a vending machine where a user selects a product and quantity, and the machine returns the price. */
public class _1vendingMachine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.Chips - Rs20\n2.Choclate - Rs30\n3.Sode - Rs40");
        System.out.println("Enter item number: ");
        int item = sc.nextInt();
        
        System.out.println("Enter the quantity: ");
        int qty = sc.nextInt();

        int price = 0;
        switch(item){
            case 1: price = 20;break;
            case 2: price = 30;break;
            case 3: price = 40;break;
            default: 
            System.out.println("Invalid item");
            return ;
        }
        
        int total = price * qty;
        System.out.println("Total amount to pay: Rs." + total );
    }
}