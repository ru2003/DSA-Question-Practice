/* lexicographical order meabns => sorting words or characters in the same way they apppear in a dictionary. */


import java.util.Arrays;
public class Lexicographicalorder {
   public static String sortedString(String str){
      //convert String to character arrray
      char[] charArray = str.toCharArray();
      //sort the character Arrray
      Arrays.sort(charArray);

      //convert back to string and return . 
      return new String(charArray);
   }
   public static void main (String[] args){
    String input = "Programming";
    String sortedString = sortedString(input);

    System.out.println("Original String:" + input);
    System.out.println("Sorted String :" +sortedString);
   }
    
}
