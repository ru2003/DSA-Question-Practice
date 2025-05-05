/* 10.Count the number of digits in a number (without converting to string). */

public class _10CountNumberofdigits {

    public static int countDigit(int num) {
          if(num == 0) 
          return 1;
          num = Math.abs(num);
          int count =0;
         

          while (num != 0) {
            num /= 10;
            count++;
          }
          return count;
         

    }

    public static void main (String[] args) {
        



    }
}
