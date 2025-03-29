/* 13)write a java programme to find duplicates values in aan array of string values.
 * -->take input 
 * -->read the string
 * -->used the nested loop
 * -->print duplicates
 */
import java.util.Scanner;
public class DuplicateStrings {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of element u want to add");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] arr=new String[size];
        //take input from the user in string format and add store into the arrya.
        for(int i=0;i<size;i++){
        
            arr[i]=scanner.nextLine();
        }

        //finding duplicates using nested looop
    
    
        System.out.println("Duplicate value in the array are:");
        boolean hasDuplicates = false;
       
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                    hasDuplicates = true;
                    break;
                    // break the loop if duplicate found as it will be printed in the next iteration.
                }
                
            }
            
        }

        //if no duplicates were found 
        if(!hasDuplicates){
            System.out.println("No duplicate element found");
        }
        scanner.close();
    }



}
    

