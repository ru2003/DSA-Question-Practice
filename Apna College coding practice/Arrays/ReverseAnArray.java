package Arrays;
/*reverse an array 
the most optimised solution is swapping the element .
for that need to create the third variable with the help of this swapping can be possible.
*/
public class ReverseAnArray {

    public static void reverse(int numbers[]){
        int first=0, last=numbers.length-1;
        while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first ++;
            last --;
        }
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        reverse(numbers);

        //printing the array
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();


    }
    
}
