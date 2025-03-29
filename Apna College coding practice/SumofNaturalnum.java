//Java Code to Find the Sum of First N Natural Numbers

import  java.util.Scanner;

public class SumofNaturalnum {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        //enter the input
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int sum =0;
        for(int i=1;i<=num;i++){
             sum += i; 
        }
        //display the result.
        System.out.println("The sum of first"+ num + "natural number is:" + sum);
    }

    
}
