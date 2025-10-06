package Strings;
//9. Check if a string contains only digits or letters.===>using builtin methods

public class Q9OnlyDigitsLetter {
    public static void main(String[] args){
        String str = "ruchita";

        if (str.matches("[0-9]+")) {
           System.out.println("string contains only digits.");//str.matches("[0-9]+") → checks if the string has only digits
//(0–9)
        } else if (str.matches("[a-zA-Z]+")) {/*str.matches("[a-zA-Z]+") → checks if the string has only alphabets
(A–Z or a–z) */
            System.out.println("String contains only letters. ");
        } else {
            System.out.println("String contains both");
        }
    }
}
