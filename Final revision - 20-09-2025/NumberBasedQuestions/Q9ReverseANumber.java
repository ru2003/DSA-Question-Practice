package NumberBasedQuestions;
//9. Reverse a number.
public class Q9ReverseANumber {
    public static void main (String[] args){
        int num = 11234;
        int reversed = 0;
        while(num != 0 ){
            int digit = num % 10;
             reversed = reversed *10 + digit;
             num = num/10;
        }

    }
}
