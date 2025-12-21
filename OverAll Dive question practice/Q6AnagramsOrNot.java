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
    }
}
