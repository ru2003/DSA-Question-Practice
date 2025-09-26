/* 
 * Count even and odd numbers.
*/
public class Q3CountEvenODd {
    public static void main(String[] args){
        int [] array = {34,67,22,89,21,90,45,33};
        int countEven = 0;
        int countodd = 0;

        for(int num : array){
            if(num % 2 ==0){
                countEven++;
            }else{
                countodd++;
            }
        }
        System.out.println("The Even Number Count is: "+ countEven + " \nThe Odd number count is: "+ countodd);
    }
}
