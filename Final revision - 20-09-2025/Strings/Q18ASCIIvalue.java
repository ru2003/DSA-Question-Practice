package Strings;
import java.util.*;
//18. Print the ASCII value of each character.
public class Q18ASCIIvalue {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to convert into its ASCII => valueL: ");

        String str = sc.nextLine();
        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);

            int ASCIvalue = ch;
            System.out.println("ASCII values are: " + ch + "=" +  ASCIvalue);
        }

    }
}
