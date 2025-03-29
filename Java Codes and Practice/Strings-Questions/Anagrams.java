/* check if 2 strings are anagrams
anagrams==>the letters must be the exactly same in both words just in a different order.
 * removes spaces and converts both strings to lowecase.
 * check length first(if different they cant be anagrams)
 * sort characters of both strings and compare them.
 * if both sorted version match they are anagrams.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

    public static boolean areAnagrams(String str1 , String str2){
//remove spaces and convert to lowercase insensitive comaprison.
        str1 =str1.replaceAll("//s" ,"").toLowerCase();
        str2 =str2.replaceAll("/s","").toLowerCase();

        //if lengths are different they cannot be anagrams
        if(str1.length() != str2.length()){
            return false;
        }
        //convert string to char arrays and srt then 
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //compare sorted arrays

        return Arrays.equals(charArray1,charArray2);

    }
    public static void main(String[] args){

        String string1 = "Listen";
        String string2 = "Silent";

        if(areAnagrams(string1,string2)){
            System.out.println("The strings are anagrams:");
        }else{
            System.out.println("The strings are not anagrams:");
        }
        


    }
    
}
