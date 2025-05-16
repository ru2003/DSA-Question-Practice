package Arrays;

public class _7MoveallzerosAttheEnd {
    public static void moveZeros(int[] arr) {
        int index = 0;

        //step1 : move all non-zero elements to the front
        for(int  i=0; i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        //steps to fill the rest with zeros
        while(index < arr.length) {
            arr[index] =0;
            index++;
        }

    }

    public static void main(String[] args) {
        int[] array = {0,1,0,3,67}; 
    }
}
