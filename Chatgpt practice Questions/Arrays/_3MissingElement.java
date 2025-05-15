package Arrays;
/*
Find the missing number in an array containing numbers from 1 to n (one missing). */
public class _3MissingElement {
    
    public static int missingElements(int[] arr , int n)  {
        int expectedSum = n*(n+1) / 2;
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
    }
}
