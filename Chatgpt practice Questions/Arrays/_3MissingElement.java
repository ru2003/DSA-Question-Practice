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

    }
    public static void main(String[] args) {

    }
}
