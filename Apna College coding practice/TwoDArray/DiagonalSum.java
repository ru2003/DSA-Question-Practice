package TwoDArray;
/*diagonal sum can only occur in the n*n matrix where roows and column number are same  
 * diagonal property ==> like diagonal element me row=column like i=j hota hain.
 * i ==> mtlb row traverse krta hain
 * j ==> mtlb column traverse krta hain.
 * solution --> runs the loop and where the condition like i=j match hota hai woh print krdo and ek element sum krdo.
 */
public class DiagonalSum {
    public static int diagonalSum(int matrix[] []) { //O(n^2) --<external loop chal rha hai n times, internal loop chal rha hai n time thats why time complexity jyada hai 
        

        int sum = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0;  j<matrix[0].length; j++) {
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1) { //like mhanje i+j ki value == hoti hai like kitne by kitne ka matrix hai usse -1.
                    sum +=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        int matrix [] [] = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16} };
        System.out.println(diagonalSum(matrix));
    }    
}
