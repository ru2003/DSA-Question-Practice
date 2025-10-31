package NumberBasedQuestions;
//11. Convert numbers to words (e.g. 512 → “Five One Two”).
import java.util.*;

public class Q11ConvertNumbertoWords {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num  = sc.nextInt();


         int originalNum = num;
         String result = "";


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
            
            switch(digit){
                case 0:
                result +=  "zero ";
                break;
                case 1:
                result += "One ";
                break;
                case 2:
                result +=  "two ";
                  break;
                case 3:
                result += "three ";
                  break;
                case 4:
                result +=  "foour ";
                  break;
                case 5:
                result += "five ";
                  break;
                case 6:
                result +=  "six ";
                  break;
                case 7:
                result += "seven ";
                  break;
                case 8:
                result += "eight ";
                  break;
                 case 9:
                result += "Nine ";
                  break;
            }
            rev = rev/10;
         }

         System.out.println("Number " + originalNum);
         System.out.println("In words: "+ result.trim());

         



    }
}
