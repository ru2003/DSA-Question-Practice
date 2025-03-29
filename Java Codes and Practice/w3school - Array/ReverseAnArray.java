/* 11)reverse an array
 * ->take input
 * ->use two pointer approch -swap the first and last element
 * ->print reversed array.
 */
/* the reason for using a while loop is that the number od swaps is based on the 
condition rather than fixed count.
 * 
 */


import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elment u ant to add in the array:");
        int size=scanner .nextInt();

        int[] arr = new int[size];

        //step 2: take array input;
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        //step to reverse an array
        int start=0 ,  end=size-1;
        while(start < end){
            //swap elements
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end]=temp;

            //move pointer
           start++;
           end--;
           //step4: 

        }
        System.out.print("Reversed array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        scanner.close();




    }
    
}
