//1. Find Element in an Array
 //Given an array and a key, return its index or -1.
public class _1LinearSearch{

    public static int linearSearc(int[] arr , int key){
        for(int i=0;i<=arr.length-1 ;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){   
        int[] arr = {2,4,5,6,77,65,90};
        int key = 4;
        
        int result = linearSearc(arr,key);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else {
            System.out.println("Elent notfound in the array.");
        }
        
        
    }
}