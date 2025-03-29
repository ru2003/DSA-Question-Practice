/* Write a java programme to convert an array to an arrayList */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {

    public static void main(String[] args){
        //Array of Integers
        Integer[] array = {10,20,30,40,50};
       

        //convert array to arrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        //display the arrayList
        System.out.println("ArrayList:" + arrayList);
    }
    
}
