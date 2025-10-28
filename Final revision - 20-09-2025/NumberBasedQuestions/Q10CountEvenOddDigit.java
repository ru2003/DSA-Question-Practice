package NumberBasedQuestions;
//10. Count even and odd digits in a number.
import java.util.Scanner;
public class Q10CountEvenOddDigit {
    public static void countEvenOdd(int number){
        int counteven = 0;
        int countodd = 0;
         while (number != 0){
            int digit  = number % 10;
            if(digit % 2 == 0){
                counteven++;
            }else{
                countodd++;
            }
               number = number / 10; 
         }

         System.out.println("Therefore the count is for : " + " EvenDigit " + counteven + " OddDigit " + countodd);
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
       int num = sc.nextInt();
       countEvenOdd(num);

    }
    
}
