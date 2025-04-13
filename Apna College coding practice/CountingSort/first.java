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
    for(int i=0; i<arr.length; i++) {
        count[arr[i]]++;
    }
    //sorting
    int j = 0;
    for(int i=0; i<count.length; i++) {
        while(count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
      }
   }

   public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) {
        System.out.println(arr[i] + " ");
    }
   }

   


    
    public static void main(String [] args) {
        int arr[] = {5,4,1,3,2};
        countingSort(arr);
        printArr(arr);
    }
}
