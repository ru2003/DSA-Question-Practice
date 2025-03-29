/* find the length of a string  without using the built in function */


public class LengthOfString {
    public static void main(String[] args){

        String input = "Hello world";
        int length = 0 ;
        for(char c: input.toCharArray()){
            length ++; //post increment operation , increased the value of length by1 after each iteration
        }
        System.out.println("Length of a String:"+length);
    }
    
}
