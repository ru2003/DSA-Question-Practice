/*9.Create a calculator using functions: add, subtract, multiply, divide. */
import java.util.Scanner;
public class _9Calculator {

    public static double add(double a, double b) {
        return a+b;
    }
    public static double substraction(double a, double b) {
        return a-b;
    }
    public static double multiplication(double a, double b) {
        return a*b;
    }
    public static double division(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("dividion by zero is not allowed");
        }
        return a / b ;
    }
    
 
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       //input
       System.out.println("Enter the first number");
       double num1 = sc.nextInt();

       System.out.println("Enter an operator(+ , - , * , /):" );
       char operator = sc.next().charAt(0);

       System.out.println("Enter the second number:");
       double num2 = sc.nextInt();

       double result;

       //switch case.==>there are various methods out of which one should use.



    }
}
