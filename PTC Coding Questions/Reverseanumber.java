// Java program to reverse a number

import java.util.Scanner;
public class Reverseanumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num  = scanner.nextInt();
        scanner.close();

        int reversed = 0 ;
        while(num!=0){
            int digit = num %10;
            reversed = reversed *10 + digit;
            num /=10;

        }
        System.out.println("Reversed number : " + reversed); 

    }
}
