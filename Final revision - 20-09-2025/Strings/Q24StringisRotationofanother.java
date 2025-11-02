package Strings;
//24. Check if a string is a rotation of another.
import java.util.*;
public class Q24StringisRotationofanother {

    public static boolean isRotation( String str1,String  str2){
        if(str1.length() != str2.length()){
          return false;
        }
        
        //step 2: concatenate s1 wit itself
        String temp =  str1 + str2;

        //check if s2 contains of temp
        return temp.contains(str2);

    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the first string: ");
         String str1 =  sc.nextLine();
         System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

          if(isRotation(str1, str2)){
            System.out.println(str2+ " is a rotation of  "+str1);
          }else{
            System.out.println(str2 + " is not rotation of "+ str1);
          }
    }
}
