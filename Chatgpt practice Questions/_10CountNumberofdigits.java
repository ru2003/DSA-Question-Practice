/* 10.Count the number of digits in a number (without converting to string). */

public class _10CountNumberofdigits {

    public static int countDigit(int num) {
          if(num == 0) 
          return 1;
          //num is a parameter inside the method — it's a local copy used inside countDigits.
          num = Math.abs(num);
          int count =0;
         
          while (num != 0) {
            num /= 10;
            count++;
          }
          return count;     

    }

    public static void main (String[] args) {
           int number = 12345;
          // number is used in the main method — it's your input.

        System.out.println("Number of digits: " + countDigit(number));
         
    }
}
