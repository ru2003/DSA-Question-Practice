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
        int count  = 1;

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else{
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        //append the last character and its count
        result.append(str.charAt(str.length()-1)).append(count);
        return result.toString();

     }
}