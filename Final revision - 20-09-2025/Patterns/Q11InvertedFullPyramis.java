/*
 * 
 */

public class Q11InvertedFullPyramis {
    public static void main(String[] args){
        int rows = 4;
        for(int i=4; i>=1; i--){
            for(int j=i; j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
