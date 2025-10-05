package Strings;

public class Q2Methodway {

    public static boolean PallindromeorNot(String str){
        String reversed = "";
        for(int i=str.length()-1; i>=0 ; i--){
            reversed += str.charAt(i);
        }
        return str.equals(reversed);

    }
    public static void main(String[] args){

        String ruchita = "Ruchita";
        String reverse="";

        if(PallindromeorNot(ruchita)){
            System.out.println("The given string is pallindrome.");
        }else{
            System.out.println("The given string is not the pallindrome.");
        }
    }
}
