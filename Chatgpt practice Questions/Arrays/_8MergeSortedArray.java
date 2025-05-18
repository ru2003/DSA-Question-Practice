package Arrays;
//two pointer method
import java.util.Arrays;
public class _8MergeSortedArray {
 
  public static int[] mergingthearray(int[] arr1, int[] arr2) {
       int n = arr1.length;
       int m = arr2.length;
       int[] merged = new int[n+m];

       int i=0, j=0, k=0; 
       //merge both arrays
       while(i<n) {
        if(arr1[i] < arr2[j]){
          merged[k++] = arr1[i++];
        } else {
          merged[k++] = arr2[j++];
        }
       }

      //copy remaining elements
      while(i<n && j<m) {
        if(arr1[i] < arr2[j]) {
          merged[k++] = arr2[i++];
         }
      }
      
      return merged;

  }
 
  public static void main(String[] args) {

  }

  
  }   

