package LinearSearch;

/* minus infinity ==> Integer.MIN_VALUE
 */
public class LargestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE ;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    
    }
    public static void main(String[] args){
      int numbers[] = {1,2,34,5,6,7};
      System.out.println("Largest value is:" + getLargest(numbers));
    }
    
}
