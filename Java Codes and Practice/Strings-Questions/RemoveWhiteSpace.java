/* remove white space from a string. */

import java.util.Scanner;
public class RemoveWhiteSpace {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      //taking input from the user
      System.out.println("Enter a string:");
      String input = scanner.nextLine();
      scanner.close();

      //removing all ehite space
      String result = input.replaceAll("\\s+" , "");

      //display the result
      System.out.println("String without spaces:"+result);

    }
    
}
