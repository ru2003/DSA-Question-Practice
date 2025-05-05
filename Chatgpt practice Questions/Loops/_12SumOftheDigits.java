
/*12.Calculate sum of digits of a number (e.g., 123 → 1+2+3=6).
Step  num	digit (num % 10)	sum	    num after num /= 10
1	  123	           3       	0 + 3 = 3	       12
2	  12		       2	    3 + 2 = 5          1
3	  1		           1	    5 + 1 = 6          0 → loop ends


 */
public class _12SumOftheDigits {
    
    public static int SumtheDigit(int num) {
        //handle negative number
        num = Math.abs(num);
        int sum =0;
        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            
        }
    }
    public static void main(String[] args) {
           
    }
}
