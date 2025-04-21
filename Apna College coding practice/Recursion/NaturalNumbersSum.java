package Recursion;
//find the sum of n natural numbers using recursion.
public class NaturalNumbersSum {
/*
 * A ladder where you go up step by step (recursive call) 
 * and then come down step by step(returning from call).
 */
    public static int calcSum(int n) {
        if(n==1) {
            return 1;
        }
System.out.println("agge ke direction me");
        int Snm1 = calcSum(n-1);
        System.out.println("stack me ulte ate time");
        int Sn = n +Snm1;
        return Sn;
        /*
         * int snm11 = calcSum(n-1); ==> waits until it gets result from the next recursive call
         * ***Only after it gets the value , it goes to n Sn=n+Snm1;
         * So thats why first line feels like it runs multiple time - because it keeps calling , and doesnt move ahead until the function below finishes.
         */
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(calcSum(n));
    }
    
}
/*
 * Imagine you're opening boxes one inside another:

You open box 3 → inside is box 2 → inside is box 1

Box 1 gives you 1

Box 2 adds 2 + 1 = 3

Box 3 adds 3 + 3 = 6


 */