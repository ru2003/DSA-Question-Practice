import java.util.Scanner;

public class FibonacciNumbers {
    
    public static void printFibonacci(int n) {
        int firstterm = 0;
        int lastterm = 1;

       //Print the first 'count' Fibonacci numbers
       for( int i= 0; i< n ;i++) {
        System.out.println(firstterm + " ");
        int nextterm = firstterm + lastterm;
        firstterm = lastterm ;
        lastterm = nextterm;   
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many Fibonacci numbers you want to display : ");

        int totalterms = sc.nextInt();

        System.out.println("Fibonacci series of  " + totalterms + "numbers:");
        printFibonacci(totalterms);     
    }
}
