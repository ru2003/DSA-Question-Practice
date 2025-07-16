//5. Write code to Check if two strings are Anagram or not
import java.util.Scanner;
public class _6PallindromeorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        String reversed = "";

        for(int i = s.length()-1;i>=0;i--){
            reversed +=s.charAt(i);
        }

        if(s.equalsIgnoreCase(reversed)){
            System.out.println("It is pallindrome.");
        }else{
            System.out.println("It is not pallindrome");
        }
    }
}
