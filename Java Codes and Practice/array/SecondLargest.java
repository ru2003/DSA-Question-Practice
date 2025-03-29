public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        // Initialize largest and second largest to the first element
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        // Step 1: Find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Step 2: Find the second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        // If secondLargest is still Integer.MIN_VALUE, no valid second largest was found
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element is found");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 87, 90, 100};
        System.out.println("Second largest: " + findSecondLargest(arr));
    }
}
