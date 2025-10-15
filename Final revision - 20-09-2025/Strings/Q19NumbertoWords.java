package Strings;
//19. Convert numbers to words, e.g. 123 → One Two Three.


//logic  -> you cannt directly loop through of an integer, 
/*
 * you can loop thorugh character of a string easily.
 * Because an integer is a single value, not a collection.
 * int num = 123;
Here,
num is just one number stored in memory — it’s not stored like [1, 2, 3].

The computer stores it as binary digits (bits):

Copy code
00000000 00000000 00000000 01111011
So there’s no direct way to access each digit separately like you can with characters in a String.
 */
import java.util.Scanner;
public class Q19NumbertoWords {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that u want to convert: ");
        int num  = sc.nextInt();
        
        //convert the number to string 
        String str = Integer.toString(num);

        //loop thorugh each character and print word
        for(int i=0;i<=str.length()-1; i++){
            char ch = str.charAt(i);

            switch(ch){
                case '0': System.out.println("Zero");
                break;
                case '1': System.out.println("One");
                break;
                case '2': System.out.println("Two");
                break;
                case '3': System.out.println("Three");
                break;
                case '4': System.out.println("Four");
                break;
                case '5': System.out.println("Five");
                break;
                case '6': System.out.println("Six");
                break;
                case '7': System.out.println("Seven");
                break;
                 case '8': System.out.println("Eight");
                break;
                 case '9': System.out.println("Nine");
                break;
                
            }
        }




    }
}
