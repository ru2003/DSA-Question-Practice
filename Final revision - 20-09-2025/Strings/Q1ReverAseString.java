

 package Strings;
public class Q1ReverAseString {
    
    public static void main(String[] args){

        String ruchita = "Ruchita";
        String reversed = "";

        for( int i= ruchita.length()-1; i>=0;i--){
            reversed += ruchita.charAt(i);
        }

        System.out.println("Reversed a String:  " + reversed);

         

    }
}
