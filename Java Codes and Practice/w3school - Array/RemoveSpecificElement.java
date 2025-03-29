/* 7)write a java programme to remove a specific element from an array. */

import java.util.Arrays;
import java.util.Scanner;
public class RemoveSpecificElement {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //taking array input 
        System.out.println("Enter the  number of elements in the arra:");
        int size =scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter" + size + "integer values");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        //sorting arrays 
        Arrays.sort(arr);

        //Removing  a duplicate element from an arraya

        int[] temp = new int[size];
        int j=0;

        for(int i=0;i<size-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[size-1]; // store last elemnt
         //printing unique element
         System.out.println("Array after removing duplicate elemnt:");
            for(int i=0;i<j;i++){
                System.out.print(temp[i] + " ");
            }
            scanner.close();
        


    }
    
}
