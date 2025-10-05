


public class Q9ExistOrNot {

    public static boolean ElementpresentorNot(int[] arr, int element){
        for(int num :arr){
           if(element == num ){
            return true;
           }
        }
        return false;
    }
     public static void main(String[] args){
        int[] array = {2,2,45,1,7,67,56,43};
        int key =3;

        if(ElementpresentorNot(array, key)){
            System.out.println("The " + key + " present in the array.");
        }else{
            System.out.println(key +" does not present in the array.");  
        }
        
     }    
}
