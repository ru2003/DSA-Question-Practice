public class largestelement{
    public static int arr(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
          int[] array = {1,2,3,4,5,6};
          System.out.println("Largest elemnt is:"+ arr(array));
    }
}