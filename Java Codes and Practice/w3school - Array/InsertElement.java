/* 9)write a java programme to insert an element(specific position)into an array.
 
 * since the arrays in java have fixed size , inserting an elemenr at 
 * specific position requires creating a new array and shifting an elements accordign to this.
 * 
 */

import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        //original array
        int[] arr={10,20,30,40,50};
        int size =arr.length;

        //display the original array
        for(int num:arr){
            System.out.print(num+" ");

        }
        //taking user input for elements and position.
        System.out.println("\nEnter the element to insert:");
        int element=scanner.nextInt();

        System.out.println("Enter the position (0 to" +size + "):");
        int position =scanner.nextInt();

        ////validation position
        if(position<0 || position>size){
            System.out.println("Invalid position ! please enter the position between 0 and "+ size);
        }else{
            //create new array
            int[] newArr = new int[size+1];
        
       
        //copying elements to the new aray and inserting the new element
        for(int i=0,j=0; i < newArr.length ; i++){

        if(i == position) {
            newArr[i] = element; //insert new element at sp
        }else{
            newArr[i]=arr[j];
            j++;
        }

    }


    //display the new array
    System.out.print("updated Array: ");
    for(int num : newArr){
        System.out.print(num +" ");
    }

        

scanner.close();

    }

}
}
