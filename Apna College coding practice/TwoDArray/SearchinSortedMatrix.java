package TwoDArray;
/* Search for a key in a row wise and col wise sorted matrix 
 * linear regression can apply becoz time complexity jyada hogi
 * agaain binary me bhi time cmplexity n(log)n) hogi becoz sare rows me binary search lagana padega so it is also not the good approch then 
 * staircase solution ==>in which take 1 as a start element and then later , go with comparing the element it will create the staircase soltuion . 
 */
public class SearchinSortedMatrix  {
        public static boolean staircaseSearch(int matrix[] [] , int key) {
            int row = 0,  col=matrix[0].length-1;
            while(row < matrix.length && col >= 0) {
                System.out.println("found key at(" + row + "," + col+ ")");
            }
        }



    public static void main(String[] args) {
        int matrix [] [] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int ket = 32;
    }
    
}
