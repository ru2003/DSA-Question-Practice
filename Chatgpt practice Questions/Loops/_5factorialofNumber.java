/* Find the factorial of a number using loop (not recursion).

*/


public class _5factorialofNumber {
    public static void main(String[] args) {
         
        int num = 5;
        int factorial =1;
        for(int i=1;i<=5;i++){
            factorial +=  i*5;
        }
        System.out.println("factorial is" + factorial);
    }
}
