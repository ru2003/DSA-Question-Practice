package Strings;
//16. Count digits, letters, and special characters in a string.
import java.util.*;
public class Q16CountDigitLetterSpecial {
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String u want to work on: ");
        String str = sc.nextLine();
        int digit =0;
        char ch =0;
        char specialCharacter = 0;


    
        if(str.matches("0-9")){
            digit++;
        }else if(str.matches("a-zA-Z")){
            ch++;
        }else{
           specialCharacter++;
        }

        System.out.println("therefore total count of each category is: " + digit + ch + specialCharacter );

        


    }
}
