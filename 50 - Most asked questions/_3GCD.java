//3. Write code of Greatest Common Divisor 
/*This problem asks to find the Greatest Common Divisor (GCD) of two given numbers. The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder. */

import java.util.Scanner;
public class _3GCD {

    public static int findGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number: ");
         int num1 = sc.nextInt();

         System.out.println("Enter second number: ");
         int nume2 = sc.nextInt();
    }
}
