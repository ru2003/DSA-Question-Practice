package Strings;
//5.Check if two strings are rotations of each other.
/*
 *  If we rotate "abcd" left by 2 positions:

    "abcd" → "bcda" → "cdab"

    Now it becomes "cdab" which is equal to s2.
    So, "cdab" is a rotation of "abcd".

 */

public class _5StringsareRotation {

    public static boolean StringRotation(String str1, String str2) {
        //if length are not equal , they cant be rotaions
        if(str1.length() != str2.length()){
            return false;
        }
       

    }
    
    public static void main(String[] args) {
        
    }
}
