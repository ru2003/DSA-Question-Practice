package Recursion;

public class Factorial {


    public static int fact( int n ) {
        
        if( n==0 ) {
            return 1;
        }
        int fnm1 = fact(n-1);//yha hum assume kr rhe hai ki f(n-1) automatically calculate ho rha hai .
        int fn = n * fact(n-1);
        return fn;
    }

    public static void main(String[] arga) {
        int n=3;
        System.out.println(fact(n));
    }
    
}
