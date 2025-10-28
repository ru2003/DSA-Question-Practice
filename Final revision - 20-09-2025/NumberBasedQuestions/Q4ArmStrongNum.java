package NumberBasedQuestions;
import java.util.*;
public class Q4ArmStrongNum {
     public static boolean isArmStrongNumber(int num){
        int temp = num;
        int count = 0;

         while(temp != 0){
          temp = temp /10;
          count++;
        }
        temp = num ;

        int sum  = 0;
        while(temp != 0){
          int digit = temp %10;
          sum += Math.pow(digit,count);
          temp = temp/10;
        }
        if(sum == num){
          return true;
        }else{
          return false;
        }

        


     }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to check whether is it Armstrong number or not: ");
       int num = sc.nextInt();
       /*
        * temp % 10 se last digit milega (agar use karna ho)
          temp / 10 se last digit remove hota hai
        */

        if(isArmStrongNumber(num)){
          System.out.println("The given number is ArmStrong Number.");
        }else{
          System.out.println("The given number is not the ArmStrong Number.");
        }

    }
}
