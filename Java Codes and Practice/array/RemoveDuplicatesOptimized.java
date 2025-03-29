public class RemoveDuplicatesOptimized {
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // No elements in the array
        }

        int j = 0; // Pointer for the position of the last unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) { // Found a new unique element
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1; // Number of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 5};
        int uniqueCount = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNumber of unique elements: " + uniqueCount);
    }
}
