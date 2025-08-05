
import java.util.*;
public class Anagram {

    public static boolean isAnagram(String str1, String str2){
         str1 = str1.replaceAll("\\s","").toLowerCase();
         str2 = str2.replaceAll("\\s","").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
         
    }
  public static void main(String[] args){
      String s1 = "Reverse";
      String s2 = "reserse";
      
      if(isAnagram(s1, s2)){
        System.out.println("Are anagrams");
      }else{
        System.out.println("Not anagrams.");
      }
      

  }  
}
