package overloading;

public class Datatypes {


    //func to calculate the int sum
    public static int sum (int a , int b){
        return a+b;
    }
    //func to cal float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(3,5));
        System.out.println(sum(12.9f ,432.8f));

    }
    
}
