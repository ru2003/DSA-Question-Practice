package Recursion;
//find the sum of n natural numbers using recursion.
public class NaturalNumbersSum {

    public static int calcSum(int n) {
        if(n==1) {
            return 1;
        }
System.out.println("agge ke direction me");
        int Snm1 = calcSum(n-1);
        System.out.println("stack me ulte ate time");
        int Sn = n +Snm1;
        return Sn;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(calcSum(n));
    }
    
}
