package Strings;
//2. Check if a string is palindrome.
import java.util.*;

public class Q2PallindromeOrNot {

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a String: ");
        String str = sc.nextLine();

        String reversed = "";

        for(int i=str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println(str + " is a [allindrome.");
        }else{
            System.out.println(str + " is not the pallindrome.");
        }
       

    }
}
