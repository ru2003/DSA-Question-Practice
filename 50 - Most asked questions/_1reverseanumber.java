//1. Write a code to reverse a number

import java.util.Scanner;
public class _1reverseanumber{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the number to reverse: ");

         int number = sc.nextInt();
         int reversed = 0;
         
         while(number != 0) {
            int digit = number % 10; //takes the last digit of the number 
            reversed = reversed * 10 + digit; //shifts the existing reversed number left by one digit and adds the new digit to it.
            number /= 10;//removes the last digit from the original number by integer division.
         }

         System.out.println("Reversed number: " + reversed);

    }
}