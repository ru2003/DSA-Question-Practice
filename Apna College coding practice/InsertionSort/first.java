package InsertionSort;
/* Pick an element (from unsorted part) and place in the right position in sorted part.
 * (n-1) ==> agr n element me se agr (n-1) elemnt ko bhi sahi jagah pe pohcha diya toh bhi array sorted ho jayega.
 */

public class first {
    public static void insertionSort(int arr[]) { 
        for(int i=1; i<arr.length; i++) {
            int curr = i;
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
        }
        

    }
    public static void main(String[] args) {

    }
    
}
