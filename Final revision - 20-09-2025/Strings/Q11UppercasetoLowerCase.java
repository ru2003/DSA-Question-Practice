package Strings;
//11. Convert all uppercase letters to lowercase and vice versa.

public class Q11UppercasetoLowerCase {
    public static void main(String[] args){

        String str = "RuchIta123";
        String Result ="";

        for(int i=0; i<str.length()-1 ; i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                Result += Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)) {
                Result += Character.toUpperCase(ch);
            }else {
                Result += ch;
            }
        }  

        System.out.println("Converted String is: " + Result);
    }
}
