package Strings;

import java.util.LinkedHashSet;

//Remove all duplicate characters from a string.
public class _6RemoveDuplicates {

    public static String removeDuplicates(String str){

        //step :1 create a linkedHashset to store character in order
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        //step 2: Loop through each character of the String
        for( char ch: str.toCharArray()) {
            set.add(ch);//if ch already exists in set , it wont be added again.
        }

        //step 3: build the result string with unique character
        StringBuilder result = new StringBuilder();
        for(char ch:set) {
            result.append(ch);
        }

        //step 4:return final string
        return result.toString();

      

    }
  public static void main (String[] args) {

  }

    
}
