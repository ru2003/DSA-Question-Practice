public class LinearSearch {
    //method to perform linear search
  public static int LinearSearch(int[] arr ,  int target){

    for(int i=0 ; i<arr.length ; i++){
       if(arr[i] == target){
        return i; // return the index if target is found
       }

       
    }
    return -1 ; //Return -1 if target is not found
    }


    public static void main(String[] args){
        int[] arr = {2,4,5,6,7};
        int target = 4;
        //call the linear search method 
        int result = LinearSearch(arr , target);
        
        ////check the result and print output
        if(result != -1){
            System.out.println("Element found at index:" + result);

        }else{
            System.out.println("Element not found in the array" );
        }

    }
    
}
