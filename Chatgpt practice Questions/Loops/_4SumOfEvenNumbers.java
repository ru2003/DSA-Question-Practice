/*
 * Find the sum of all even numbers between 1 and
 *  100.
 */

public class _4SumOfEvenNumbers {
    public static void main(String[] args) {
         int sum =0;
         for(int i=2 ; i<=100;i++){
            if(i % 2 ==0){
                sum += i;

            }
         }
         System.out.println("The sum of even numbers between the 1 to 100:"+sum);
    }
    
}
