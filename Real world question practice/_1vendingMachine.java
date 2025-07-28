
import java.util.*;
public class _1vendingMachine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Chips - Rs20\n 2. Choclate - Rs30\n 3.Sode - Rs40");
        System.out.println("Enter item number: ");
        int item = sc.nextInt();

        System.out.println("Enter the quantity: ");
        int qty = sc.nextInt();

        int price = 0;
        switch(item){
            case 1: price = 20; break;
        }
    }
}