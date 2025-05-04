/*Print all numbers from 1 to N, but for multiples of 3 print "Fizz",
 for 5 print "Buzz", and for 3 and 5 both print "FizzBuzz". (⭐ FizzBuzz 
 is a famous interview question) in java
 */

 import java.util.Scanner;

 public class FizzBuzz{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //taking the input
         System.out.println("Enter the value of N:");
         int N = sc.nextInt();

         // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {//this condition should come first always
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
 }