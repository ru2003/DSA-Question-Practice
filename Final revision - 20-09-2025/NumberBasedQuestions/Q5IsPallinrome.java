package NumberBasedQuestions;
//5. Check if a number is palindrome.
import java.util.Scanner;


public class Q5IsPallinrome {


    public static boolean checktheNum(int num){
        int reversed = 0
      while(num != 0){
        int digit = num %10;
         reversed = reversed + digit;
         num = num / 10;
      }
      if(num == reversed){
        return true;
      }else{
        return false;
      }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
    }
}
