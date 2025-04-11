package TwoDArray;
import java.util.*;
/* @-D array -->  suppose n*m  --> n= rows and m =columns  */
public class First {
    public static void main(String[] args){
        int matrix [] [] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
       //rows==> matrix.length & columns==>matrix[0].length.

       Scanner sc = new Scanner(System.in);
       for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            matrix[i] [j] = sc.nextInt();
            

        }
       }

    }
    
}
