/* Concepts used: if-else, while loop, switch, conditionals

🧠 Use Case: Handle withdrawal, balance check, and deposit using a menu-driven program.*/

import java.util.*;
public class _2ATMMachine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        while(true) {
            System.out.println("\n1. Check Balance\n2. Withdrawn\n3. Deposit\n4. Exit");
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: 
                System.out.println("Current balance: Rs" + balance);
                break;

                case 2:
                System.out.println("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Withdraw: Rs" + withdraw);
                }else{
                    System.out.println("Insufficient Balance.");
                }
                break;
               
            }
        }
    }
}
