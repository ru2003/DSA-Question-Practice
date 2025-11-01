package Strings;
//16. Count digits, letters, and special characters in a string.
import java.util.*;
public class Q16CountDigitLetterSpecial {
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String u want to work on: ");
        String str = sc.nextLine();
        int digit =0;
        int ch =0;
        int specialCharacter = 0;

       for (int i=0;i<=str.length()-1; i++){
        char cha = str.charAt(i);
        
         if(Character.isDigit(cha)){
            digit +=1;
        }else if(Character.isLetter(cha)){
            ch += 1;
        }else{
           specialCharacter +=1;
        }
       }
        System.out.println( " Total Digit: " + digit + "\n, Total Character: " + ch + ", \n Total Special Character: " + specialCharacter );    
    }
}

