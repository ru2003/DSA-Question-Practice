package Strings;
//26. Replace spaces with “%20” (URL encoding).
import java.util.*;
public class Q26ReplaceSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String: ");
        String str = sc.nextLine();
        String result ="";
        for(int i=0;i<str.length() ; i++){
            char ch= str.charAt(i);
/*➡️ ' ' (single quotes) → character literal
➡️ " " (double quotes) → string literal */
            if(ch == ' '){
               result+="%20";
            }else{
                result +=ch;
            }
        }
        System.out.println("Original String: "+str);
        System.out.println("URL encoded string: "+ result);
    }
}
