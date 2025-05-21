package Strings;
//Capitalize the first letter of each word in a string.
public class _4Capitalizewords {
    
    public static int capitalizeWords(String str) {
        //split the string into words using whitespace
        String[] wrords = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

    }
    public static void main(String[] args) {
        String str1 = "hello myself ruchita chaudhari";

        String output = capitalizeWords(str1);

    }
    
}
