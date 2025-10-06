package Strings;
//12. Reverse a string with using built-in functions.
public class Q12ReverseaString {
    public static void main(String[] args){
          String str = "Ruchita";

          StringBuilder sb = new StringBuilder(str);

          String reversed = sb.reverse().toString();

          System.out.println("Original String: "+ str);
          System.out.println("Original String: "+ reversed);
    }
    }

