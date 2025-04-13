package InbuiltSort;
/* import java.util.Collections
 * Arrays.sort(arr,Collections.reverseOrder())
 * Arrays.sort(arr,si,ei,Collections.reverseOrder())
 */
import java.util.*;
public class collections {
    public static void printArr(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
    
}
