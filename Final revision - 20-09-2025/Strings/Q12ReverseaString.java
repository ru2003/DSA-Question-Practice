package Strings;
//12. Reverse a string with using built-in functions.
public class Q12ReverseaString {
    public static void main(String[] args){
          String str = "Ruchita";
/*"ye reverse() method kya hum sirf StringBuilder pe apply kar sakte hai?"

✅ Yes, the reverse() method is available only for StringBuilder and StringBuffer classes —
not directly on String. */
          StringBuilder sb = new StringBuilder(str);

          String reversed = sb.reverse().toString();

          System.out.println("Original String: "+ str);
          System.out.println("Original String: "+ reversed);
    }
    }

