package Backtracking;

public class Array {
    public static void changeArr(int arr[], int i, int val) {

    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = new int[5];
        changeArr(arr, 0,1);
        printArr(arr);

    }
    
}
