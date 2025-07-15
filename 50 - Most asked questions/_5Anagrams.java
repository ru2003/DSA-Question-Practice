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
    }
    public static void main(String[]args){

    }
}
