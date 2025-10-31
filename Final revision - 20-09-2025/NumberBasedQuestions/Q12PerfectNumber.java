package NumberBasedQuestions;
import java.util.Scanner;
public class Q12PerfectNumber {
    public static void main(String[] args){
/*👉 A Perfect Number is a number that is equal to the sum of its proper divisors (excluding itself). */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num/2; i++){
            if(num % 2 == 0){
                sum += i;
            }
        }

        if(num == sum){
            System.out.println("The given number is Prime Number. ");
        }else{
            System.out.println("the given number is not the prime number.");
        }
    }
}
