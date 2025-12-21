//Find missing number (1 to N)

public class Q3MissingNumber {
    public static void main(String[] args){
/*N = 5
arr = {1, 2, 4, 5}
Missing number = 3
 */

int[] arr = {1,2,4,5};
int N = 5;
int expectedsum = N*(N+1) /2;
int actualsum =0;
 
   for(int i=0;i<arr.length;i++){
   actualsum += arr[i];
}

int missingNumber = expectedsum - actualsum;
System.out.println("Missing Number: " + missingNumber);

    }

    
}