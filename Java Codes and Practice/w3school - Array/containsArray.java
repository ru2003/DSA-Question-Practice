/* 6)write a java programme to test if an array contains a specific value. */

/*  */

import java.util.Arrays;
import java.util.Scanner;

public class containsArray {

     public static void main(String[] args){

        int[] arr={10,20,30,40,50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to check:");
        int target=scanner.nextInt();

        boolean found = false;
        for(int num:arr){
            if( num == target) {
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(target + "is present in the array");
        }
        else{
            System.out.println(target+"is not present in the array");
        }
    
        scanner.close();

    }
    
}

/* Scanner scanner =new Scanner(System.in) 
 * Scanner is a class in java (java.util.Scanner)
 * it is used to read input from various sources like keyboard,files,streams
 * Scanner scanner: Declares a variable named scanner of type Scanner.
new Scanner(System.in): Creates a new Scanner object that takes input from the keyboard.
 */
