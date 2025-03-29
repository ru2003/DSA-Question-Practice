/* 6)write a java programme to find the index of an array element */
import java.util.*;
public class IndexofArray {
    public static void main(String[] args){
     
        int[] arr={12,23,45,56,89};

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number to find its index:");
        int target=scanner.nextInt();

        int index=-1;//default value if element is not found.\

       for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            index=i;
            break;
        }
       }

       //display result
       if(index!=-1){
        System.out.println(target+" the element found at the index"+index);
       }else{
        System.out.println(target+" the element is not found in the array");
       }

       scanner.close();

    }
    
}
