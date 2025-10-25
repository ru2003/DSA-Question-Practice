package NumberBasedQuestions;
import java.util.*;
public class Q4ArmStrongNum {
     public static boolean isArmStrongNumber(int num){
        int temp = num;
        int count =0;
         while( temp != 0){
          temp = temp /10;
          count++;
        }
        

     }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
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
