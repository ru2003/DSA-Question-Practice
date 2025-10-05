import java.util.*;


public class Q8FrequencyOfElement{
    public static void main(String[] args){
     int[] arr = {12,14,78,9,12,45,5,6,7,7,7,78};

     //Use Hashmap to store frequency
     Map<Integer, Integer> freqMap = new HashMap<>();
     for(int num : arr){    //loop through each array element
        freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        /*
       t	Meaning
for (int num : arr)	==> Loop through each array element
freqMap.getOrDefault(num, 0)	===> Get old frequency (or 0 if not present)
+ 1	                         ===> Increase count by 1
freqMap.put(num, …)      ===> 	Save updated frequency
entrySet() =====> 	Get all key–value pairs from map
entry.getKey()	====> The array element
entry.getValue()====> Its frequency count
         */
     }

     //print the frequencies:
     System.out.println("\n Frequency of each element: ");
     for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
        System.out.println(entry.getKey() + " -> " + entry.getValue() + "times");
     }


    }
}