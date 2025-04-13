package CountingSort;
/* counting sort aise case me use hota hai jaha test cases kam hote hai , like marks n all and frequency me hote usse sort kiya jata hai 
 * time complexity is like O(n+range)
 * there will be 2 loops --> first one will be for frequency count krne ke liye and then 
 * 2nd loop will be for ---> will go till range 
 */
public class first {
   public static void countingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest+1];
   }

    
    public static void main(String [] args) {
        Integer arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
