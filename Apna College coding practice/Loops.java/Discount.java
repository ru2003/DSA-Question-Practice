/* : Print a bill for a customer that calculates the total sum of
 prices and applies 10% discount if the bill is more than 500.

*/

public class Discount {

    public static void main(String[] args) {
       int arr[] = { 100,200,300,600};

       int sum = 0;
       for(int i=0; i<arr.length; i++) {
           sum += arr[i];    
           }
           /* % ==> wrong operator and wrong use of int  */
           double discount = 0;
           if( sum > 500) {
              discount = 0.10 * sum;
           }

           double finalBill = sum - discount;
           //int result = int sum - int bill; ==> you dont write int in fornt of variable names during calculations.
           System.out.println("Total Bill: " + sum );
           System.out.println("Total discount: " + discount);
           System.out.println("Total prize after discount: " + finalBill);
    }
    
}
