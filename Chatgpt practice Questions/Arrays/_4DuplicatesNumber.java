package Arrays;
/*Find duplicates in an array. */
public class _4DuplicatesNumber {
    
    public static void duplicates(int[] arr) {
         System.out.println("Duplicates element are:");
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                     System.out.println(arr[i]);
                     break;
                }         
            }
    
        }

    }

    public static void main(String []args) {
       int[] array = {12,23,12,56,78,34};
       duplicates(array);
    }
}
