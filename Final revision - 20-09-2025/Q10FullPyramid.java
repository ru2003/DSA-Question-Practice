/*Full pyramid of stars.

   *
  ***
 *****
******* */

public class Q10FullPyramid {
    public static void main(String[]args){
        int rows =4;

      for(int i=1; i<=rows;i++){
        for(int j=i;j<rows;j++){
            System.out.print(" ");
        }

        for(int k=1;k<=i*2-1;k++){
            System.out.print("*");
        }
        System.out.println();
      }

    }
    
}
