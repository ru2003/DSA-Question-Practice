//write a java programme to reverse an array.

public class reverse{
    public static void main(String args[]){

        int []arr = {1,2,3,4,5};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int i=0;i<n;i++){
            //swap a[i] and a[l-i-1]
            // |a| |b| |temp|
            // |4| |3| ||

            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-i-1] = temp;

        }

        for(int element:arr){
            System.out.println(element + "");
        }




    }
}