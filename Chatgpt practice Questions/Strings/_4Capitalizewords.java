package Strings;
//Capitalize the first letter of each word in a string.
public class _4Capitalizewords {
    
    public static int capitalizeWords(String str) {
        //split the string into words using whitespace
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(String word:words) {
            //capitalize first letter and apppend the rest in lowercase
            if(word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase())
                .append(" ");
            }

        }

    }
    public static void main(String[] args) {
        String str1 = "hello myself ruchita chaudhari";

        String output = capitalizeWords(str1);

    }
    
}
