//find the maximum 

public class MaximumofThree {
    public static void main(String[] args){


        int num1 =12, num2 = 24, num3 = 2;
        int max;

        if(num1 >= num2 && num1>=3 ){
            max=num1;
        }else if(num2 >= num1 && num2 >= num3){
            max=num2;
        }else{
            max=num3;
        }
        System.out.println("The maximum of three number is :" + max);
    }
    
}
