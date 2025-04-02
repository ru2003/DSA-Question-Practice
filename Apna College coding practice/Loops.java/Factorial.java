//Write a program to find the factorialof any number entered by the user

import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial *= i;
        }
      
      System.out.println("the factorial of any number is:"+ factorial );


    }
}
/* 
 * import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Handle negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
        
        sc.close(); // Close Scanner
    }
}

 */