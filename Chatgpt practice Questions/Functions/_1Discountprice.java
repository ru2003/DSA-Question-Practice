
/*1. Write a function calculate_discount(price, discount_percent)
 that returns the price after applying discount. Use it to print bills
  for 5 customers. */

import java.util.Scanner;

public class _1Discountprice{

     static double calculate_discount(double price,double discountPercent) {//Anything that can be calculated inside, like discountAmount, should be kept inside the method.
      double  discountAmount = price * discountPercent/100;
      return price - discountAmount;
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        for(int i=1;i<5;i++) {
            System.out.println("Customer" + i + ":");

            System.out.println("Enter the original price");
            double price = sc.nextDouble();

            System.out.println("Enter the discount percentage");
            double discountPercentage = sc.nextDouble();

            //call the method.
            double finalPrice = calculate_discount(price, discountPercentage);
            System.out.println("Final price after discount: ₹" + finalPrice);
            System.out.println("-----------------------------");
        }
        sc.close();

       }
  }
