package Strings;

//Count the number of words in a given string.
public class _3CounttheNumberofWords {
    public static int countWords(String str) {

        //trim temoves leading and trailing spaces
        if(str == null || str.trim().isEmpty()) {
            return 0;
        }
        //split the string by one or more spaces using regex
        String[] words = str.trim().split("//s+");

        return words.length;

    }
    public static void main(String[] args){
        String input = "Ruchtita Chudhari is learning java";

        int wordCount = countWords(input);
        System.out.println("Number of words:" + wordCount);


    }
}
