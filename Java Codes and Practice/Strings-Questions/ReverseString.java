/* StringBuilder--> stringbuilder is mutable sequence off characters in java , used to efficiently manipulate stringd
 * .it is a part of java.lang package and provides better performance than strings when modifying strings frequently
 * 
 */
/* StringBuilder is not a string , it is mutable sequence of characters
   sb.toString() is a method of the stringBuilder class in java . it converts a stringbuilder object into a string 
   it id necessary when working with methods 
*/ 

 import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed String is:" + sb.toString());


    }
    
}
