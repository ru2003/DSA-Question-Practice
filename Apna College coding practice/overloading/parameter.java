package overloading;



public class parameter {
    
//function to calc sum of 2 nums
public static int sum(int a, int b){
    return a+b;

}
//function to calc sum of 3 numbers
public static int sum(int a, int b, int c){
    return a + b + c;
}
    public static void main(String[] args){
     System.out.println(sum(3,5));
     System.out.println(sum(1,23,32));
    }
    
}

