package SelectionSort;
/* pick the smallest (from unsorted), put it at the beginning.
 * 
 */
public class first {
    public static void selectionSort( int numbers[] ){
        for(int i=0; i<numbers.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[minPos] > numbers[j]) {
                    minPos = j;
                }

            }
            //swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;

        }

    }

    public static void printArr(int numbers[]) {
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args){
        int  numbers[] = {1,4,5,3,2};
        selectionSort(numbers);
        printArr(numbers);

    }

}
