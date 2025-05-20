package Strings;
//strings are immutable -once created they cannot be changed.
public class _1ReverseaString {
    
    public static String reverseString(String str) {
            String reversed = "";
            
            //loop from end to start
            for(int i = str.length()-1;i>=0;i--) {
                reversed += str.charAt(i);//append character in reverse order.
            }//str.charAt(i) ==> accesses each character in the original string.
            return reversed; 
    }
    public static void main(String[] args) {
        String original = "India";

        String result = reverseString(original);
        System.out.println("The String after reversed:" + result);
    }
}

