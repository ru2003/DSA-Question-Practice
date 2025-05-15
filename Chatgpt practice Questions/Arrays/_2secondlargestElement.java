package Arrays;
/*2.Find the second largest element in an array. */
public class _2secondlargestElement {
    
    public static int secondlargest(int[] arr) {
        
        if(arr.length <2) {
            System.out.println("Array must contain at least two wlements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            }else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        

    }
    public static void main(String[] args) {
        
    }
}
