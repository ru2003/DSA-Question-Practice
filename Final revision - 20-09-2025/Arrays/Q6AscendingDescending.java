/* 6.Check if an array is sorted in ascending/descending order.*/
import java.util.Scanner;
public class Q6AscendingDescending {


    public static boolean isAscending(int[] arr){
        for(int i=0;i<=arr.length-1;i++){//arr.length-1 ===> becoz we cant check last elemnt with next in case f last elemnt.

            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(int [] arr){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<arr[i+1]){
            return false;
        }
        }
        return true;/*===> if i completes the loop that means it is in the order if it gets out of the loop its not int he order. */
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elment u want to add in the array: ");
        int num = sc.nextInt();

        
        int[] array = new int[num];//this is to create the array.
        System.out.println("Enter the element in the arraya: ");
        for(int i=0;i<array.length;i++){
           array[i] = sc.nextInt();
        }

        if(isAscending(array)){
            System.out.println("Array is sorted in ascending order.");
        }else if(isDescending(array)){
            System.out.println("arrays is sorted in descending order");
        }else {
            System.out.println("Array is neither sorted in ascending order or descending order.");
        }


       


       }
    }


