/*
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]

-->in java we only create object of the class not the method.
--->use static when - the method does not depend on any instance variables or non static members.
--->you want to use it as a utility/helper method.

without static :
-->u need to create an object of the class to call the method.

e.g. TwoSum obj = new TwoSumClass();
     int[] result = obj.twoSum(nums,target);

 */

public class TwosumBruteForce {
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.lenght;j++){
                
            }
        }

    }
    public static void main(String[] args){
        

    }
}
