package Strings;
import java.util.HashMap;
//2.Find the most frequent character in a string.
public class _2MostFrequentCharacter {
    public static String freqCount(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        //count frequency of each character
        for(char ch : str.toCharArray()) {
            freqMap.put(ch,freqMap.getOrDefault(ch,0) +1);
        }
        char mostFrequent = ' ' ;
        int maxCount =0;
    }
    public static void main(String[] args) {
         
        
    }

}
