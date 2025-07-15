//4. Write code of  Perfect number
import java.util.Scanner;
public class _4PerfectNumber {

    public static void PerfectNumber(int num) {
          int count =0;
         for(int i=1;i<num;i++){
            if(num % i == 0){
                 count += i;
            }
         }
         if(count == num){
            System.out.println("It is a perfect number.");
         }
         else{
            System.out.println("It is not a perfect number.");
         }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    
      System.out.println("Enter a number to check whether it is perfect number or not: ");
      int num = sc.nextInt();
       PerfectNumber( num);

    }
    
}
