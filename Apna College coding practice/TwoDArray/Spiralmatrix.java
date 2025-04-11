package TwoDArray;
//matrix spriral ke form me print karwana hai .
public class Spiralmatrix { 
    public static void printSpiral(int matrix [] []) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top -->column
            for(int j=startCol; j<=endCol; j++){
                System.out.println(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.println(matrix[i] [endCol] + " ");
            }
        }
     }
    public static void main(String[] args){

    }
    
}
