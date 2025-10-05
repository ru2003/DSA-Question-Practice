package Strings;
//4. Count words in a sentence.
public class Q4CountWords {
    public static void main(String[] args){
         
        String str = "Ruchita Chaudhari is learning the java";
        
        String[] words= str.trim().split("\\s");
        /*
         * 1.str.trim() => removes extra space a the start or end
         * split("\\s") => split by one or more space
         */
        
        int wordcount = words.length;
        System.out.println("Number of words "+  wordcount);

    }
}
