/*
 *  *Take two numbers and operator (+, -, , /) and calculate result.

Use: switch-case for operation

Create methods like:

add(a, b)

subtract(a, b)

multiply(a, b)

divide(a, b)
**********here it is basically - clean java program that takes two numbers and an
operator (+,-,*,/) ,performs the appropriate calculating using switch-case, and uses methods for each operation.
 */

import java.util.*;

public class _7CalculatorApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number: ");
        double num2 = sc.nextDouble();

        System.out.println("enter the operator: (+ , - , * , /)");
        char operator = sc.next().charAt(0);

        double result = 0;


    }
}
