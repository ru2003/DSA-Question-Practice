/* 12.Diamond pattern.

   *
  ***
 *****
  ***
   *            */

public class Q12DiamondPattern {
    public static void main(String[] args){

        int rows = 3;
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=rows-1;i>=1;i--){

            for(int j=i; j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}
