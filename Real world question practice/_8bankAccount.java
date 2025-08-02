/*
 * ✅ 3. Bank Account System
🧠 Simulate a bank account with deposit, withdraw, and check balance.

Use: while loop for menu

switch-case for user actions

Create methods like:

deposit()

withdraw()

checkBalance()
 */

import java.util.*;
public class _8bankAccount {


    static double balance = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int choice ;
        while(true) {
            //display menu
            System.out.println("\n======Bank Menu========");
            System.out.println("1.deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.checkbalance");
            System.out.println("4.Exit");

            System.out.println("Enter the choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1: 
                deposit(sc);
                break;

                case 2:
                withdraw(sc);
                break;

                case 3:
                checkbalance();
                break;

                case 4: 
                System.out.println("thank you for using our service.");
                return ;

                default: 
                System.out.println("Invalid choice.Please try again.");
            }
        }
          
    }
            public static void deposit(Scanner sc){
                System.out.println("enter the amount to deposit.");
                double amount = sc.nextInt();
                if(amount > 0){
                    balance += amount;
                    System.out.println("Deposited Rs.  "+ amount);
                }else{
                    System.out.println("Invalid deposit amount.");
                }
            }
            
            //public static withdraw money.
            public static void withdraw(Scanner sc){
                System.out.println("enter amount to withdraw: ");
                double amount = sc.nextDouble();
                if(amount > 0 && amount<=balance){
                    balance -= amount;
                    System.out.println("withdraw Rs. "+ amount);
                }else{
                    System.out.println("Insufficient balance or invalid amount.");
                }
            }

            public static void checkbalance(){
                System.out.println("Current balance : "+ balance);
            }




    
}
