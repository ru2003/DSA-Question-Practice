package functions;
//whether the number is prime or not?
public class prime{

     public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1 ; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
     }

    public static void main(String[] args){
        System.out.println(isPrime(12));
    }  
}
