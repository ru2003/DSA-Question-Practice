//Find the maximum and minimum element.

public class Q2MaximumandMinimumElement {
    public static void main(String[] args){
        
        int[] arr = {3,7,98,78,2,1,90};
        int max = arr[0];
        int min = arr[0];
         
        for(int num :arr){
            if(num>max){
                max=num;
            }

            if(num < min){
                min = num;
            }
        }

   System.out.println("MAximum elemenrnt is: "+ max);
   System.out.println("Minimum Element is: "+ min);
    }
}
