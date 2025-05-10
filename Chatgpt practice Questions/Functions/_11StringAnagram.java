/* 11.Create a function is_anagram(str1, str2) that checks if two strings are anagrams.
note ==> ye boolean wale originally true hi hote hain and coditions false wali theni hoti hain.
 */
import java.util.Arrays;
public class _11StringAnagram {
     public static boolean AnagramChecker(String str1, String str2) {

        //function to check of strings ara anagrams or not
        str1 = str1.replaceAll("/s" , "").toLowerCase();
        str2 = str2.replaceAll("/s" ,"" ).toLowerCase();

        //if lengths are different , they cant be anagrams
        if(str1.length() != str2.length() ){
            return false;
        }

        //converting string to char Array and then sorting them 
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //compare sorted array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //compare the sored array
        return Arrays.equals(arr1,arr2);
     }
    public static void main(String[] args) {

    }
}
