package TwoDArray;
//matrix spriral ke form me print karwana hai .
public class Spiralmatrix { 
    public static void printSpiral(int matrix [] []) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        

        //row ya column mese jo minimum hota hai woh decide krta hai  , loop kitne barr run hoga 
        while(startRow <= endRow && startCol <= endCol) { //start row and end row == rakhna padega in case of odd number square.
            //top -->column -->row fix hai starting column se lekar ending column tk ja rhe hai.
            for(int j=startCol; j<=endCol; j++){
                System.out.println(matrix[startRow][j]+" ");
            }

            //right ->row traverse kr rhe hai pr start row+ 1 se travel kr rhe hai and then later end column fix hai
            /* niche ya upar jate time row traverse krte hain anad horizontal jate time columns tracerse krte hain. */
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.println(matrix[i] [endCol] + " ");
            }

            //bottom
             for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                } 
                System.out.println(matrix[endRow][j] +" ");//jo variable hota hai like jo badlata hai uske liye lete hai like i or j
             }
             //left
             for(int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.println(matrix[i] [startCol] + " ");
             }
             startCol++;
             startRow++;
             endCol--;
             endRow--;

        }
        System.out.println();
     }
    public static void main(String[] args){
          int matrix[] [] = {{ 1,2,3,4} ,
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}  };
        printSpiral(matrix);
  
    }
    
}
