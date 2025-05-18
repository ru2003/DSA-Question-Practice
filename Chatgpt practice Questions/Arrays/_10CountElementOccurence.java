package Arrays;
//10.Count the number of occurrences of a specific element in an array.
public class _10CountElementOccurence {
    
    public static int countElement(int[] arr, int key) {
        int count=0;
         for(int num : arr) {
            if(num == key) {
                count++;
            }
         } 
    }
    public static void main(String[] args) {

    }
}
