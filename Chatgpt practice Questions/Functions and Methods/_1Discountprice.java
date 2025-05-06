
/*1. Write a function calculate_discount(price, discount_percent)
 that returns the price after applying discount. Use it to print bills
  for 5 customers. */

import java.util.Scanner;

public class _1Discountprice{

    public static int calculate_discount(double price,double discountPercent) {//Anything that can be calculated inside, like discountAmount, should be kept inside the method.
      double  discountAmount = price * discountPercent/100;
      return price - discountAmount;
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<=5;i++) {
            System.out.println("Customer" + i + ":");
        }

       }
  }
