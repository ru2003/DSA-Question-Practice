package Arrays;
/*2.Find the second largest element in an array. */
public class _2secondlargestElement {
    
    public static int secondlargest(int[] arr) {
        
        if(arr.length <2) {
            System.out.println("Array must contain at least two elements.");
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

        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no largest element(all elements might be same )");
            return -1;
        }

        return secondLargest;
        
        

    }
    public static void main(String[] args) {
         
        int[] array = {1,2,3,4,5,8};

        int result = secondlargest(array);

        if(result != -1) {
            System.out.println("Second largest element is:" + result);
        }

    }
}
