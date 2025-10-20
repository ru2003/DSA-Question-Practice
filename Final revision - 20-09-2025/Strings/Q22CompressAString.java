package Strings;
//22. Compress a string (like “aaabbc” → “a3b2c1”).
public class Q22CompressAString {
     public static void main(String[]args){
        String input ="aaabbbssrrr";
        String compressed  = compressString(input);

        System.out.println("Compressed String: "+ compressed);

     }
     
     public static String compressString(String str){
        //if string is empty , return it
        if(str == null || str.isEmpty()){
            return str;
        }

        StringBuilder result = new StringBuilder();
        
     }
}