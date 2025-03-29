//writte a java programme to detect whether a number entered by the user is integer or not
import java.util.Scanner;
public class code6 {
    public static void main(String args[]){
         
        System.out.println("Entery your number");
        Scanner sc= new Scanner(System.in);

        System.out.println(sc.hasNextInt());
    }
    
}
