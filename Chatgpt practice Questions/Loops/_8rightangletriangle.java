/*Print the pattern

markdown
Copy code
*
**
***
**** */


public class _8rightangletriangle {
    public static void main(String[] args) {
        int num =4;
        for(int i=1; i<=4;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
