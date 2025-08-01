
import java.util.*;
public class Anagram {

    public boolean isAnagram(String str1, String str2){
         str1 = str1.replaceAll("\\s","").toLowerCase();
         str2 = str2.replaceAll("\\s","").toLowerCase();

        if(str1.length() != str2.length()){
            return true;
        }
         
    }
  public static void main(String[] args){


  }  
}
