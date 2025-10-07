package Strings;
import java.util.*;
//14. Replace all spaces with underscores (or any symbol).
public class Q14ReplaceAllSpaces {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string u want to add: ");
        String str = sc.nextLine();

        String replaced = str.replace(" ","$");
        System.out.println("Modifies String: " + replaced);

    }
    
}
