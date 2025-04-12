
/* time complexity ==> k=log2n 
 * tc directly proportional to the log2n that is ==> O(log n)
 * time complexity of binary search is always less and the code of binary search always performs well.
*/
public class First {
    public static int binarySearch(int numbers[] , int key){
         int start =0, end=numbers.length-1; //numbers.length gives u total number of length but indexing 1 se kam hoti hai so tab tk ke indexing tk loop chalana hain.
         while(start <= end) {
            int mid = (start + end)/2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key){ //right
                 start = mid+1;
            }else{ //left
                end = mid-1;

            }
         }
         return -1;
        }
    

    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8};
        int key = 2;
    System.out.println("index for the key is:" + binarySearch(numbers,key));

    }
    
}

