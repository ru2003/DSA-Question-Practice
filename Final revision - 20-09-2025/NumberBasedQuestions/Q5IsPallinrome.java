package NumberBasedQuestions;
//5. Check if a number is palindrome.
import java.util.Scanner;


public class Q5IsPallinrome {


    public static boolean checktheNum(int num){
        int reversed = 0;
        int original = num;
      while(num != 0){
        int digit = num %10;
         reversed = reversed *10 + digit;
         num = num / 10;
      }
      if(original == reversed){
        return true;
      }else{
        return false;
      }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int  number = sc.nextInt();
        if(checktheNum(number)){
            System.out.println("The given number is pallindrome.");
        }else{
            System.out.println("The given numebr is not pallindrome.");
        }
    } 
}
