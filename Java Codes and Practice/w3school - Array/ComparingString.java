/*14)write a java programme to find common elements between two arrays(String values) 
 * -->user enters 2 loops
 * -->a nested loop compares each element of the first array with elements in the second array.
 * -->if match is found ,it prints the common element.
 * -->uses a hasCommon flag to check if there are common elements.
 * -->if no common elements are found ,it prints :No common element found
*/

import java.util.Scanner;
public class ComparingString {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //Inout size for the first array
        System.out.println("Enter the number of elements in the first array");
        int size1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        String[] arr1 = new String[size1];
        //taking input for the first array.
        System.out.println("Enter" + size1 + " String values in the array");
        for(int i=0;i<size1;i++){
            arr1[i] = scanner.nextLine();
           
        }

        //input for the second array
        System.out.println("Enter the number of elments in the second array:");
        int size2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        String[] arr2 = new String[size2];
        //taking input for the second array.
        System.out.println("Enter " + size2 + " String values for the second array");
        for(int i=0;i<size2;i++){
            arr2[i] = scanner.nextLine();
            

        }

        boolean hasCommon = false;//flag to track common elements.
        //finding common elments using nested looop
        System.out.println("The common elements in both the arrays are:");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr1[i].equals(arr2[j])){
                    System.out.println(arr1[i]);
                    hasCommon = true;
                    break;//avoid printing dupliates
                }
            }
        }

        //if no common elelments found
        if(!hasCommon){
            System.out.println("No common element found");
        }
        scanner.close();



    }
    
}
