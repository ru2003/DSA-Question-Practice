package Strings;

public class _7LongestWord {
    public static String LongestWord(String str) {
         String[] words = str.trim().split("\\s+");
          
         String longestword = " ";
         //treat as a array =>jaise ki array me longest word use kiya jata hai waise hi 
         //minimum declare krne ka and then anntr mg beta 
         for(String word:words) {
            if(word.length() > longestword.length() ) {
                longestword = word ;
            }
         }
         return longestword;

    }
    public static void main(String[] args) {
          String input = "hello hi my name is ruchita Chaudhari" ;
          String output = LongestWord(input);
          
    }
    
}
