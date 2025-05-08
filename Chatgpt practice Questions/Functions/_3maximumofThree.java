/*3.Create a function to find the maximum of three numbers. */

public class _3maximumofThree{

    public static int maximofThree(int a, int b,int c) {
       if(a>b && a>c){
        return a;
       }else if(b>c && b>a) {
        return b;
       }else{
        return c;
       }

          
    }
    public static void main(String[] args) {
           int a = 2;
           int b = 3;
           int c = 4;
           System.out.println(maximofThree());
    }
}