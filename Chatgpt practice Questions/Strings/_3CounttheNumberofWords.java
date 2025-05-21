package Strings;

//Count the number of words in a given string.
public class _3CounttheNumberofWords {
    public static int countWords(String str) {

        //trim temoves leading and trailing spaces
        if(str == null || str.trim().isEmpty()) {
            return 0;
        }
        //split the string by one or more spaces using regex
        String[] words = str.trim().split("\\s+");
        //1)  //s ==> split wherever thaeres one or more whitespace characters.
        // 2) even thoough there were multiple spaces , it doesnt leave epty strings in between - it treats all  the spaces as one big spliter.
        //3) here \t and  \n are whitespace too
        //note  ==> if we wrote "s+" ==java would treat it as the letter 's' not whitespace
        //in java script a single backslash \ is an escape character
        // so to write a literal backslash in the regex we use double backslash \\s+
        return words.length;

    }
    public static void main(String[] args){
        String input = "Ruchtita Chudhari is learning java";

        int wordCount = countWords(input);
        System.out.println("Number of words:" + wordCount);


    }
}
