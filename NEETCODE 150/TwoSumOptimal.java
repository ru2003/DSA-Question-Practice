/*
 * time complexity = O(n),
 * Space complexity = O(n)
 */
import java.util.*;
public class TwoSumOptimal {
    
    public int[] twoSum(int [] nums,int target){

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args){
         int[] arr = {1,2,3,4,4,9,5};
         int target = 7;

         TwoSumOptimal sum = new TwoSumOptimal();
         int result = sum.twoSum(arr, target);
         System.out.println("Indices are: "+ arr[0]+arr[1]);
    }
}
