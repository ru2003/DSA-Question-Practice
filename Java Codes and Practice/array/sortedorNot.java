// write a java programme to find whether an array is sorted or not
public class sortedorNot{
    public static void main(String args[]){

        boolean isSorted = true;
        int [] arr = {1,2100,3,455,5,34,67} ;
        

        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1])
               { 
                isSorted=false;
                break;
            }
        }
      if(isSorted){
        System.out.println("the array is sorted");
      }  
      else{
        System.out.println("the array is not sorted");
      }
    }
}