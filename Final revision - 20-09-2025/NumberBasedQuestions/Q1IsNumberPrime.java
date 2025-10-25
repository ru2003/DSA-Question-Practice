package NumberBasedQuestions;
import java.util.Scanner;
public class Q1IsNumberPrime{
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("The given number is prime number.");
        }else{
            System.out.println("The given number is not the prime number.");
        }

        public static boolean isPrime(int number){
              if(number<=1){
                return false;
              }

              for(int i=2;i<=math.sqrt(number);i++){
                  
              }
              


        }
    }
} 