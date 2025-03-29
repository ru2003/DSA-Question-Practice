//create an array of 5 floats and calculate their sum

public class one{
    public static void main(String args[]){

        float[] marks={34.5f , 45.6f , 78.4f , 34.6f, 23.5f};
        float sum = 0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the addition of marks is" + sum);

    }
}