package Strings;
import java.util.HashMap;
//2.Find the most frequent character in a string.
public class _2MostFrequentCharacter {
    public static char freqCount(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
/*A HashMap is used to store each character as a key and its count (how many times it appears) as the value. */
        //count frequency of each character
        for(char ch : str.toCharArray()) {//str.toCharArray() turns the string into a list of characters.
            freqMap.put(ch,freqMap.getOrDefault(ch,0) +1);
        }
        char mostFrequent = ' ' ;
        int maxCount =0;
        //find the cahracter with maximum frequency
        for( char key:freqMap.keySet()) {
            if(freqMap.get(key) > maxCount) {
                maxCount = freqMap.get(key);
                mostFrequent=key;
            }
        }
        return mostFrequent;
    }
    public static void main(String[] args) {
         String inpput = "ruchitachaudhari";
         char result = freqCount(inpput);
         System.out.println("Most frequent characer :"+ result);
        
    }

}
