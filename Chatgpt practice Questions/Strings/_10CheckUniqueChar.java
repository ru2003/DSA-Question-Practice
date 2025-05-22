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
        return true;//all characters are tru
    }

    public static void main(String[] args) {
        String input1 = "ruchita";
        String input2 = "hey";

        System.out.println(input1 + "has all unique characters " + CheckUniqueChar(input1));
        System.out.println(input1 + "has all unique characters " + CheckUniqueChar(input2));

    }
    
}
