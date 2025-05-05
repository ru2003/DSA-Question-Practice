/*Reverse a number (e.g., input: 1234 → output: 4321) */
/*
 * num % 10 → Get last digit
   num /= 10 → Remove last digit (to move to the next one)
 */
public class _11reverseAnumber {
    
    public static int ReverseNumb(int num) {

        int reversed =0;
        while(num !=0){
            int digit = num % 10; //get the last digit because of this.
            reversed = reversed * 10 + digit ;//jo last wala element mila use aage rakho and then uske previous wala uske baas thats it .
            num /= 10; //remove last digit 
            //num is a parameter in the reverseNumber() method.
        }
        return reversed;
    }
    public static void main(String[] args) {
            int number = 1234;//number is a variable defined in main().
            System.out.println(ReverseNumb(number));
    }
}
