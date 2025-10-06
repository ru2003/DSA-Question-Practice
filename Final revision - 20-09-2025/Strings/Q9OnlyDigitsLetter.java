package Strings;
//9. Check if a string contains only digits or letters.===>using builtin methods

public class Q9OnlyDigitsLetter {
    public static void main(String[] args){
        String str = "ruchita";

        if (str.matches("[0-9]+")) {
           System.out.println("string contains only digits.");
        } else if (str.matches("[a-zA-Z]+")) {
            System.out.println("String contains only letters. ");
        } else {
            System.out.println("String contains both");
        }
    }
}
