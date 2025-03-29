/* 14)write a java programme to find the common elements between two integer arrays */


import java.util.Scanner;
public class CommonIntegers { 
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    //input size for 1st array.
    System.out.println("Enter the number in the first arrya:");
    int size1 = scanner.nextInt();

    int[] arr1 = new int[size1];
    System.out.println("enter " + size1 + "integer values for the first arrya");
    for(int i=0;i<size1;i++){
        arr1[i] = scanner.nextInt();
    }

    //Input size for the second array.
    System.out.println("Enter the number of elements in the second array:");
     int size2 = scanner.nextInt();

     int[] arr2 = new int[size2];
     System.out.println("Enter " + size2 + "integer value for the second array:");
     for(int i=0;i<size2;i++){
        arr2[i] = scanner.nextInt();
     }

     //boolean hasCommon elements
     boolean hasCommon = false;
     System.out.println("The common element in bothe arrays are:");
     for(int i=0;i<size1;i++){
        for( int j=0;j<size2;j++){
            if(arr1[i] == arr2[j]){

            System.out.println(arr1[i]);
            hasCommon=true;
            break;
        }
        }
     }
   
    //if no common elements are found:
    if(!hasCommon){
        System.out.println("No common elements found:");
    }
    scanner.close();
    
}
}