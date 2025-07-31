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
        boolean validOperation = true;

        //switch case for operation
        switch(operator){
            case '+' :
            result = add(num1,num2);break;

            case '-':
            result = subtract(num1,num2);break;

            case '*':
            result = multiply(num1,num2);break;

            case '/':
            if(num2 != 0){
                result = divide(num1,num2);break;
            }else{
                System.out.println("error: division by zero is not alloed.");
                validOperation = false;
            }




        }


    }
}
