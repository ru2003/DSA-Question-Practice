//write a code to find the simple interest

public class SimpleInterest{
    public static void main(String[] args){

        double principal = 1000;
        double rate = 12;
        double time=2;

        double Intrest = principal*rate*time/100;
        System.out.println("The simple interest is " + Intrest);
    }
}