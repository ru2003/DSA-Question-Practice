package Arrays;
/*1.Find the largest element in an array. */

public class _1LargestElement {
    public static int largestelement(int[] arr) {
        int  max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
      int[] array = {1,2,3,55,7,89};
      System.out.print("[");
      for(int i=0; i<array.length;i++) {
        System.out.print(array[i] +" ");
      }
    
      System.out.println("]");
      System.out.println("Largest element of the array is:" + largestelement(array));
    }
}
