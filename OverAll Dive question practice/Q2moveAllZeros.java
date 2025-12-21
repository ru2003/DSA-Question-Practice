//2.Move all zeros to end

public class Q2moveAllZeros {
    public static void main(String[] args){
        int index = 0;
         int[] arr = {3,4,0,0,6,5,10};

         for(int num : arr){
            if(num != 0 ){
                arr[index++] = num;
                /*
                nums[i] ki value ko nums[index] par copy karo
                 
               */
            }
         }

         while(index <= arr.length-1){
            arr[index++] = 0;
         }




          System.out.println("array after moving al the zeros at end");
         for(int num : arr){
           
            System.out.print(num + " ");
         }

    }
}


//⏱️ Time & Space Complexity
/* 
Time Complexity:

One loop to read → O(n)

One loop to fill zeros → O(n)

Total → O(n)

Space Complexity:

No extra array used

Only variables → O(1)*/