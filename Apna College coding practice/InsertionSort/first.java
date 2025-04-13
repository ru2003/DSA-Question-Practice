package InsertionSort;
/* Pick an element (from unsorted part) and place in the right position in sorted part.
 * (n-1) ==> agr n element me se agr (n-1) elemnt ko bhi sahi jagah pe pohcha diya toh bhi array sorted ho jayega.
 */

public class first {
    public static void insertionSort(int arr[]) { 
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion 
            arr[prev+1] = curr;
        }
    }
    public static void  printArr( int curr[]){
        for(int i=0; i<curr.length; i++){
            System.out.println(curr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
 
    }
    
}
