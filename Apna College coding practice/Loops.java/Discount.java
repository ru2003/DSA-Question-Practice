/* : Print a bill for a customer that calculates the total sum of
 prices and applies 10% discount if the bill is more than 500.

*/

public class Discount {

    public static void main(String[] args) {
       int arr[] = { 100,200,300,600};

       int sum = 0;
       for(int i=0; i<arr.length; i++) {
           sum += arr[i];
           if(sum >500){
            /* % ==> wrong operator and wrong use of int  */
            int bill = 10/sum;

            int result = int sum - int bill;//int result = int sum - int bill; ==> you dont write int in fornt of variable names during calculations.
           }
       }
    }
    
}
