//Java program to print the Fibonacci series



import java.util.Scanner;
public class Fibonacciseries {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter the number of terms:  ");
         int n = scanner.nextInt(); 
         scanner.close();

         int first = 0 , second = 1;
         
         System.out.print("Fibonacci Series: " + first + " " + second);
         for(int i = 2 ; i<=n ;i++){
            int next = first + second ;
            System.out.print(" " + next);
            first= second;
            second=next;
         }
         
    }

    
}
