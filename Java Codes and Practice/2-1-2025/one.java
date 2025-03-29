//create an array of 5 floats and calculate their sum


public class one{
    public static void main (String args[]){
        float [] marks={23.4f,45.6f,32.7f,78.9f,90.5f};
        float sum=0;
        for (float element:marks ){
            sum=sum+element;
        }
        System.out.println("The value of sum is "+sum);
    }
}