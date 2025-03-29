/* 10 -write a java programme to find the maximum and minimum value of an array
  -first decide how manuy user input u have to take
  then create array->of that size 
  ->now take the input values for that array using loop and store it in the array
 * ->then apply minimum and maximum condition to get and then display the values .ohky .
 */

 import java.util.Scanner;
public class maximumMinimum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //taking user input 
        System.out.println(" Enter the number of elements in the array:");
        int size=scanner.nextInt();

        int[] arr=new int[size];

        //taking the user input
        System.out.println("Enter"+size+"element:");
        
        //taking user input for array elements.
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        ///finding the maximum and minimum of the array.
        
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //display the results
        System.out.println("Minimum value in the array:"+min);
        System.out.println("Maximum value in the array:"+max);
        
       scanner.close();
        






    }
    
}
