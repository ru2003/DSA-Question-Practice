/*19)write a java programme to add two matrices of the same size */

import java.util.Scanner;
public class AddTwomatrices {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //taking input from the matrix size 
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        //Declare matrices.
        System.out.println("Enter the elements for the first matrix:");
       
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] summatrix = new int[rows][cols];

        //Input for the first matrix 
        System.out.println("Enter elements for the first matrix:");
       for(int i=0 ; i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix1[i][j] = scanner.nextInt();
        }
       }
       //Input for second matrix
       System.out.println("Enter the elements for the second matrix:");
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix2[i][j] = scanner.nextInt();
        }
       }
       
    //perform matrix addition
    for(int i=0 ; i<rows ;i++){
        for(int j=0;j<cols;j++){
            summatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }

    //displaying the result
    System.out.println("The sum of the two matrix is:");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(summatrix[i][j] + " ");
        }
        System.out.println();
    }
     scanner.close();

    }
    
}
