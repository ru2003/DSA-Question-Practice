//5. Write code to Check if two strings are Anagram or not
import java.util.*;
public class _5Anagrams {

    public static boolean isAnagram(String str1, String str2){
        //remove whitespace and covert to lowercase for fairness
        str1 = str1.replaceAll("\\s" , "").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        //if element is of different length remove it 
        if(str1.length() != str2.length()) {
           return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //compare sorted array
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[]args){
           String num1 = "Listen";
           String num2 = "Silent";

           if(isAnagram(num1, num2)){
            System.out.println("They are anagrams");
           }else{
            System.out.println("They are not anagrams");
           }
    }
}
