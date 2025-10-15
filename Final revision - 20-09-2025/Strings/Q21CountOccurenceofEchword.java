package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//21. Count occurrences of each character.
public class Q21CountOccurenceofEchword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String: ");
        String str = sc.nextLine();
        

        //create a hashmap to store the character and their count
        /*
         * Term	What it is	Meaning
           Map =Interface It defines how a "key–value" pair collection behaves (methods like put(), get(), containsKey(), etc.)
           HashMap =Class It’s one of the implementations of the Map interface — it actually stores data in hash table form.
         */
        Map<Character, Integer> map = new HashMap<>();

       for(int i=0; i<=str.length()-1; i++){
        char ch = str.charAt(i);
         //ignore spaces if u want 
        if(ch ==' '){
            continue;
        }

        //if charcter already in a map , increase count
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
      }
      //print character count
      System.out.println("Character occurence: ");
      for(Map.Entry<Character, Integer> entry : map.entrySet() ){
        System.out.println(entry.getKey() + " -> "+entry.getValue());
      } 


    }
}
