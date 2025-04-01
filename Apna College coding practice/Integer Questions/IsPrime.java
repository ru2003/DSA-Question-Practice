//Here is a Java program to check whether a number is prime or not:

import java.util.Scanner;
public class IsPrime {
    public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the number:");
         int num  = scanner.nextInt();
         scanner.close();

         boolean isPrime = true;

         if(num<=1){
            isPrime = false;
         }else {
            for(int i=2 ; i<num ;i++){
                if(num%i == 0){
                    isPrime =false;
                    break;
                }

            }
         }
         //display the result
         if(isPrime) {
            System.out.println(num+" is a prime nummber.");
         }else {
            System.out.println(num +" is not the prime number");
         }



    }
}
