package Strings;

import java.util.LinkedHashSet;

//Remove all duplicate characters from a string.
public class _6RemoveDuplicates {

    public static String removeDuplicates(String str){

        //step :1 create a linkedHashset to store character in order
        LinkedHashSet<Character> set = new LinkedHashSet<>(); //a "Set" in java only stores unique values so if u dont try to add the same character twice,it will keep only first one.
         //LinkedhashSet ==> insted of normal hashSet because it maintains the insertioni order (so the output looks natural.)
        //step 2: Loop through each character of the String
        for( char ch: str.toCharArray()) {
            set.add(ch);//if ch already exists in set , it wont be added again.
            //duplicates are automaticallly ignored.
        }

        //step 3: build the result string with unique character
        StringBuilder result = new StringBuilder(); //used to build the string
        for(char ch:set) {
            result.append(ch);
        }

        //step 4:return final string
        return result.toString();
    }
  public static void main (String[] args) {
        String input = "ruchitachaudhari";

        //call the method to remove duplicates
        String output = removeDuplicates(input);

        //print the result
        System.out.println("String after removing duplicates: " + output);
  }

    /*
     ** Regular String	           ** StringBuilder
        Immutable	                   Mutable
    Slower for repeated ops   	Faster for repeated ops
    Creates new objects      	Modifies the same object
   Not memory-efficient	           Memory-efficient


     */
}
