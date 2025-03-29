/*Write a java programme to convert an ArrayList to an array. */


import java.util.ArrayList;

public class ArrayLLIsttoArray {
    public static void main(String[] args){

        //Create an Arraylist 
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        System.out.println("ArrayList is:" + arrayList);

        //Convert arrarylist to array 
        String[] array =  new String[arrayList.size()];
        array = arrayList.toArray(array);

        //Display on the array 
        System.out.print("Array:");
        for(String item:array)
           {
              System.out.print(item+" ");
            }

    }
    
}
