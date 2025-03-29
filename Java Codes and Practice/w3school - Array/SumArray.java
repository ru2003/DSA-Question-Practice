/* write a java programme to sum the values of an array */

public class SumArray {
    //define an array
    public static void main(String[] args){
    
        //variable to store array
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    
    //varable to store sum
    int sum = 0;

    //loop through the array and add each 

    for(int num : arr){
        sum += num;
    }

    //print the sum
    System.out.println("Sum of array element:" + sum);




    }
    
}
