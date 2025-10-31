package NumberBasedQuestions;
//11. Convert numbers to words (e.g. 512 → “Five One Two”).
import java.util.*;

public class Q11ConvertNumbertoWords {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num  = sc.nextInt(0);


         int originalNum = num;
         String result = " ";


         if(num ==0){
            System.out.println("zero");
            return;
         }

         int rev =0;
         while(num > 0){
            int digit = num %10;
            rev = rev*10 + digit;
            num = num /10;///jispar process krte hai ,like hum num peprocess kr rhe hai toh hum ,usse khi aur store krenge.
         }
         


         while(rev > 0){
            int digit = rev % 10;
            
         }

         



    }
}
