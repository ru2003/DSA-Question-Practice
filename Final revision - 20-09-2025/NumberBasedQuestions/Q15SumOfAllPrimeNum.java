package NumberBasedQuestions;
//15. Sum of all prime numbers in a range.
import java.util.*;
public class Q15SumOfAllPrimeNum {

    public static boolean isPrime(int num){
        for (int i= 2; i< num;i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
           
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start  = sc.nextInt();
        System.out.println("enter the last number: ");
        int last = sc.nextInt();
          int sum =0;
        for(int i=start ; i<=last; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println("The sum of prime number is: " + sum);



    }
}
