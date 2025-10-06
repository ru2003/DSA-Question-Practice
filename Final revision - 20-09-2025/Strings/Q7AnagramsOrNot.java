package Strings;

import java.util.Arrays;

public class Q7AnagramsOrNot {
    public static void main(String[] args){
          
        String str1 = "silent";
        String str2 = "listen";


        //step 1 to remove spces and converting it into lowercase
        str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        //step 2: check if lengths are equal .
        if (str1.length() != str2.length()){
            System.out.println("not Anagrams.");
            return ;
        }
        
        //step 3: convert into char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("The String are Anagram.");
        }else{
            System.out.println("The strings are not anagrams.");
        }



    }
}
