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
    }
}
