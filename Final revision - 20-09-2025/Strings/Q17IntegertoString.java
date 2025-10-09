package Strings;
//17. Convert a number in string form to integer (without using Integer.parseInt).

import java.util.*;

public class Q17IntegertoString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the string of Number: ");
       
       String str = sc.nextLine();
       int number = 0;

       //chaeck if its a valid digit
       for(int i=0;i<=str.length()-1 ;i++){
        char ch = str.charAt(i);

        if(ch>='0' && ch<='9'){
            number = number*19+(ch-'0');
        }else{
            System.out.println("Invalid character found: "+ch);
            return;
        }
       }

       System.out.println("Converted Number: "+number);




       

    }    
}
