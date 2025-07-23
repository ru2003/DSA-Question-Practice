//11. Write to code to check whether a given year is leap year or not.
import java.util.Scanner;
public class _10Leapyearornot {
    public static boolean Leapyear(int year){
        if((  year % 4 ==0 &&  year %100 != 0) || ( year % 400 == 0)  ){
            return true;    
        }else{
           return false;
    }
}
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a year: ");
         int year = sc.nextInt();
         if(Leapyear(year)){
            System.out.println("The give year is leap year");
         }else{
            System.out.println("The given year is not leap year.");
         }
    }
}
