package Arrays;
 //find the array which has the maximum sum .
 /* just like hum addition krte then ,  ek variable declare krto tevha tya element chi sum add krt jato . */
public class maxSubArraySum {

    public static void maxSubArraySum(int numbers[]){

        int currSum = 0; 
        int MaxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=0; j<numbers.length; j++){
                int end = j;
                currSum = 0; 
                for(int k=start; k<=end; k++){
                    //SubArray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("max sum: " + MaxSum);
    }
    public static void main(String[] args){
        int numbers[] = {2,4,-1,7,-2};
        maxSubArraySum(numbers);

    }
}
