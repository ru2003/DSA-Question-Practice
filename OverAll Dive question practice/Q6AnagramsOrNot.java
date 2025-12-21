import java.util.Arrays;
public class Q6AnagramsOrNot {
    public static void main(String[] args){

        String str1 = "silent";
        String str2 = "listen";
        
      str1 = str1.replaceAll("\\s" ,"").toLowerCase();
      str2 = str2.replaceAll("\\s" , "").toLowerCase();

      if(str1.length() != str2.length()){
        System.out.println("No Anagram.");
        return;
      }

      char arr1[] = str1.toCharArray();
      char arr2[] = str2.toCharArray();
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);

      if(Arrays.equals(arr1,arr2 )){
System.out.println("the Strings are anagrams.");
      }else{
        System.out.println("Strings are not anagrams.");
      }



    }
}
