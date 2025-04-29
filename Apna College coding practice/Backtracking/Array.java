package Backtracking;
//like array print krna hai 1 to 5 and print krte time -2 krna hai har value se and then use print krna hain .
//time complexity O(n)
public class Array {
    public static void changeArr(int arr[], int i, int val) {
     //base case
      if(i == arr.length ) {
        printArr(arr);
        return ; 
      }
     //recursion
     arr[i] = val;
     changeArr(arr, i+1,val+1);//fnx call step
     arr[i] = arr[i] -2;//backtracking step
     //backtracking function call ke bad hi hoti hai ,pehle kabhi nhi hoti .
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 

    public static void main(String[] args){
        int arr[] = new int[5];
        changeArr(arr, 0,1);
        printArr(arr);

    }
    
}
