package Arrays;
/*Find duplicates in an array. */
public class _4DuplicatesNumber {
    
    public static int duplicates(int[] arr) {
         
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;i++) {
                if(arr[i] == arr[j]) {
                     return arr[i];
                }         
            }
            return arr[i];
        }

    }

    public static void main(String []args) {

    }
}
