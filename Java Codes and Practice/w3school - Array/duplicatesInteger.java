/* 12)write a java programme to find duplicates values in an arrayof integer values. */
/*first of all --> take input from user
-->double nested loop 1 element lega then compare with all the array  then next element
and then !hasDuplicates is for checking .
 * 
 */
import java.util.Scanner;
public class duplicatesInteger {
    public static void main(String[] args){

        Scanner scanner =new Scanner (System.in);

        //take input for size
        System.out.println("Enter the number of elemnts in the array:");
        int size=scanner.nextInt();

        int[] arr=new int[size];
        //take input for array element

        System.out.println("Enter"+size+"elements");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        //finding duplicates using nested loop
       System.out.println("Duplicates value in the array: ");
       boolean hasDuplicates = false;
    
       for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i] == arr[j]){
                System.out.print(arr[i]+ " ");
                hasDuplicates = true;
                break;
            }
        }
    }
    if(!hasDuplicates){
        System.out.print("No duplicates found.");
    }
 scanner.close();
    }
                                                            
}
 
























