package Arrays;
import java.util.*;
public class ArrayBasics {
    public static void main(String[] args){

        /*
        int marks[] = new int[12];
        int numbers[] = {1,2,3};
        int moreNumbers[] = {4,5,3};
        String fruits[] = {"apple" , "chickoo" , "citaphal"};
        System.out.println(numbers);  
        */
        
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks for physics");
        marks[0] = sc.nextInt();
        System.out.println("enter marks for chemistry");
        marks[1]=sc.nextInt();
        System.out.println("enter marks for maths");
        marks[2]=sc.nextInt();
        

        System.out.println("phy " + marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("math " + marks[2]);

        //UPDATE
        marks[2] = 100;
        System.out.println("maths: " + marks[2]);

    }
}
