public class IsArraySorted {

    public static boolean isSorted(int[] arr){
        //handle edge cases
        if(arr == null || arr.length<2){
            return true;
        }

        //check for ascending order
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Is the array sorted?" + isSorted(arr));

        int[] arr1={2,5,3,7,1,2};
        System.out.println("Is the array sorted?" + isSorted(arr1));

    }
}
