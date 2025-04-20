package Recursion;
//it is very important to know that in which line there will be recusrion call and in which statemtn there will be print statement .
public class Increasing {
/*Before call → happens as you go deeper (top-down).

After call → happens as you return (bottom-up).

 */
    public static void printInc(int n) {
        if (n ==1) {
            System.out.println(n + " ");
            return ;
        } 
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static void main(String [] args) {
        int n=10;
        printInc(n);
    }
    
}
