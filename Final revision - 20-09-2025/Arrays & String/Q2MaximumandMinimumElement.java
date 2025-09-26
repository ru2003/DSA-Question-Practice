//Find the maximum and minimum element.

public class Q2MaximumandMinimumElement {
    public static void main(String[] args){
        
        int[] arr = {3,7,98,78,2,1,90};
        int max = arr[0];
        int min = arr[0];
         
        for(int i :arr){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

   
    }
}
