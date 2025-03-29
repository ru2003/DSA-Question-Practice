/*8) write a java programme to copy an array by iterationg the array */
/*Since arrays in Java have a fixed size, we need to manually copy each element from the original array to a new array.*/
 /* --create an original array
 * -create a new array of the same size
 * -iterate through the original array and copy elements one by one
 * -display the copied array .
 */

public class CopyAnArray {
    public static void main(String[] args){
        //original array
        int[] originalArray = {1,2,3,4,5};

        //copied new array
        int[] CopiedArray = new int[originalArray.length];
        //copy elements manually using a loop
        for(int i=0;i<originalArray.length;i++){
            CopiedArray[i]=originalArray[i];
        }

        //displau copied array
        System.out.print("Copied array:");
        for(int num:CopiedArray){
            System.out.print(num+" " );
        }

        


    }
    
}
