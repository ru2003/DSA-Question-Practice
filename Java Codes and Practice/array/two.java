//write a programme to find out whether a given integer is present in an array or not.



public class two {
    public static void main(String args[]){

        int []marks = {12,23,45,67,89};
        int num = 455;
        boolean  isInArray = false;

        for(int element : marks){
            if(num == element){
                isInArray = true;
                break;

            }
        }
        if(isInArray){
            System.out.println(num + " present in the array");
        }
        else{
            System.out.println(num + " value is not present in the array");
        }

    }
    
}
