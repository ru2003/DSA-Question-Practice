/*5.Create a function is_prime(number) that returns True/False.
Example:
For number = 29:

i = 2 to 5 (since √29 ≈ 5.38)

29 is not divisible by 2, 3, 4, or 5
✅ So, no divisor found → it’s a prime.
 */
public class _5EvenorOdd {

    public static boolean  is_prime(int num) {
         if(num == 1){
            return false; //// Numbers less than or equal to 1 are not prime
         }
         //check for the numbers from 2 to suqre root of number 
         for (int i=2;i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; //found a factor , so not a prime.
            }

         }
         return true;
         
    }
    public static void main(String[] args) {
        int number = 17;
        if(is_prime(number)){
            System.out.println(number +" is a prime number");
        }else{
            System.out.println(number+" is not a prime number");
        }

    }
}
