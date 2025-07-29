/* Concepts used: if-else, boolean flags, loops, regex (optional)

🧠 Use Case: Validate if a password is strong – at least 8 characters, includes digits, special characters, uppercase, and lowercase.*/

import java.util.*;

public class _4Password {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        boolean hasDigit = false, 
        hasUpper = false,
        hasLower = false,
        hasSpecial = false;

        if(password.length() >= 8) {
           for (char c: password.toCharArray()){
                if(Character.isDigit(c)) hasDigit = true;
                else if (Character.isUpperCase(c)) hasUpper=true;
                else if(Character.isLowerCase(c)) hasLower = true;
                else hasSpecial = true;
           }

           if(hasDigit && hasUpper && hasLower && hasSpecial) {
            System.out.println("Strong Password!");
           }else {
            System.out.println("Weak Password. Try again.");
           }
        }else{
            System.out.println("Password is too short!");
        }
    }
}
