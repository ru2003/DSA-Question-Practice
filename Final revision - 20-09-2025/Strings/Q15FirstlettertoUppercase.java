package Strings;
//
//15. Convert each word’s first letter to uppercase (title case).
import java.util.*;

public class Q15FirstlettertoUppercase {
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the String u want to add: ");
           String str = sc.nextLine();

           //split the string into words based on space
           String[] words = str.split(" ");
           String result="";

           for(String word :  words){
              //convert first letter to capital and rest to lowercase

              String capitalized = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
              result += capitalized + " ";
           }
           //print the result
           System.out.println("Title Case:  "+ result.trim());
    }
}
