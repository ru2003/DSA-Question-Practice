//Java Program to Find the Greater of Two Numbers

import java.util.Scanner;
public class maximumoftwonumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        //take the input
        System.out.println("Enter the first Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("The greates of two number is:" + num1);
        }else if(num2>num1){
            System.out.println("The greates of two number is:" + num2);
        }else{
            System.out.println("Bothe the number are equal");
        }


    }
}
