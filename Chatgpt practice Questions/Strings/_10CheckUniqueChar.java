package Strings;
//10.Check if a string has all unique characters.
import java.util.HashSet;
public class _10CheckUniqueChar {

    public static boolean CheckUniqueChar(String str) {

        HashSet<Character> seen = new HashSet<>();

        for(char ch : str.toCharArray()) {
            if(seen.contains(ch)) {
                return false;
            }
            seen.add(ch);

        }

    
    }

    public static void main(String[] args) {

    }
    
}
