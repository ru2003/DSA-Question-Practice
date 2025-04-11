package TwoDArray;
//most  optimised solution for addition of diagonals of matrix --> ek hi loop likhna pad gya. 
public class OptimisedDiagonalSum {

    public static int diagonalSum(int matrix[] []) {
        int sum =0;
      for(int i=0; i<matrix.length; i++) {
        //primary dimension
        sum += matrix[i] [i];
        //sd
        if(i != matrix.length-1-i)
        sum += matrix[i] [matrix.length-i-1];
      }
      return sum;
    }
    public static void main(String[] args) {
        int matrix [] [] = {
            {1,2,3,4} ,
             {5,6,7,8} ,
              {9,10,11,12} , 
              {13,14,15,16}
        };
        System.out.println( "Diagonal sum:"+ diagonalSum(matrix));

    }
}
