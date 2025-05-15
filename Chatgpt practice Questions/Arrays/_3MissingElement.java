package Arrays;
/*
Find the missing number in an array containing numbers from 1 to n (one missing). */
public class _3MissingElement {
    
    public static int missingElements(int[] arr , int n)  {
        int expectedSum = n*(n+1) / 2;//The sum of the first n natural numbers starting from 1 (not 0), and with no duplicates or missing numbers.
        //If you have numbers from 1 to n, and exactly one number is missing, the formula works perfectly to find the missing number.
        int actualSUm = 0;

        for(int num : arr) {
            actualSUm += num;
        }

        return expectedSum - actualSUm;

    }
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,6,9,10};

       int n = 10;
       int elementmissing = missingElements(array, n);
       System.out.println("Missing element is:" + elementmissing);

       /*❌ Array doesn't start at 1
e.g. {2, 3, 4} → Not valid, formula assumes 1 to n.

❌ More than one number is missing
You’d need a different approach like XOR or hashing.

❌ There are duplicates
The actual sum becomes incorrect.

❌ Array contains 0
The formula is for numbers from 1, not from 0 */
    }
}
