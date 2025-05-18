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
         return count;
    }
    public static void main(String[] args) {
      int[] array = {5,4,2,7,2,6,9,2};
      int key =2;
      int result = countElement(array, key);
      System.out.println("The element " + key +" Occurs: " +result+ " times");

    }
}
