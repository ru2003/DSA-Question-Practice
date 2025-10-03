/*
 * 4.Print all negative numbers in the array.
 */
import java.util.*;
public class Q4NegativeNumbers {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array : ");
         int n  = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter " + n + " elements.");
         for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
         }

         System.out.println("Arrys elements are : ");
         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
         }

         for(int num : arr){
            if(num < 0){
                System.out.println("Negative Numbers are : " + num + " ");
            }
         }


          
    }
}
