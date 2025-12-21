
public class Q1Secondlargest{
    public static void main(String[] args){

        int arr[] = {2,3,4,1,5,7,10};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        
        for(int num : arr){
           if(num > largest){
             secondlargest = largest ;//first update secondlargest 
             largest = num;//then upate ;argest
            }else if(num > secondlargest && num != largest){
                secondlargest  = num ;
            }
        }

        if(secondlargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found !");
        }else{
            System.out.println(secondlargest + " is the Second Largest Element.");
        }
/*
⏱️ Complexity

Time: O(n)

Space: O(1) */
    }
}