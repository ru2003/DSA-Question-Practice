package Strings;
//23. Reverse words in a sentence.
import java.util.*;
public class Q23ReversedaWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence u want to reverse the words within it : ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" ");

        String reversedSentence= "";
        for(int i=words.length-1; i>=0; i--){
            reversedSentence += words[i] + " ";
        }

        reversedSentence = reversedSentence.trim();

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed words: " + reversedSentence);


    }
}
