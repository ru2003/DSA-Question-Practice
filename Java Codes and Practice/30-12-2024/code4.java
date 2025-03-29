//write a java programme which asks user to enter his name and print the msh hello<name> have a good day
import java.util.Scanner;

public class code4 {
    public static void main(String args[]){
       
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        System.out.println("hello " + name + " rhave a good day!");


    }
}
