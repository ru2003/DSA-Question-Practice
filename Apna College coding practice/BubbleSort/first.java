package BubbleSort;
//implement the bubble sort
public class first {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {// agr pehla turn he to j=0 se lekr arr.length-1-turn  mtlb 5 element hai to (5-1 -1) on a very first turn , then second turn la 5-1-1 ==> 3 paryant chalvaycha loop thats it 
                if(arr[j] > arr[j+1]) {
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);

    }
}
