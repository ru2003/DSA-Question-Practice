//check whether the string is pallindrome or not.
/* 1)convert the string to lowercase
 * 2)remove spaces ==> avoid case sensitivity and ignores spaces in phrases
 * 3)use two pointers==>to compare from both ends without extra spaces usage
 * 4)use while loop ==>for loop -->typically runs for fixed number of times .
 * A while loop is better when the number of iterations depends on conditions rather than fixed range.
 * O(n) time and O(1) time complexity.
 */

import java.util.Scanner;

public class Pallindrome{

    public static boolean isPallindrome(String str){

        //Remove spaces and convert to Lowercase for uniformity
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0 , right = str.length()-1;

        while(left<right){

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = scanner.nextLine();
        scanner.close();
         //now again this prove like using the method we use and inout string we take 
        if (isPallindrome(input)){
            System.out.println("The String is pallindrome :");
        }else{
            System.out.println("The String not  pallindrome:");
        }
     }
}




