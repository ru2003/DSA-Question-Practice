/* 4)write a java programme to calculate the average value of any element */

public class AverageofArray {
    public static void main(String[] args){
          
        int[] arr= {2,3,4,55,6,7};
        int sum =0;

        for(int element:arr){
            sum += element;
        }
       /*  System.out.println("the average of the element of arrya is:"+sum/arr.length); */

       double average = (double) sum /arr.length;
      System.out.println("the average of the element od the array is"+average);
    }
    
}
