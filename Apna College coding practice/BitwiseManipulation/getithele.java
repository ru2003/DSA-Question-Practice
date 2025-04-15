package BitwiseManipulation;

public class getithele {
    public static void getIthBit(int num , int i) {
        int bitmask = 1 << i; // create a bitmask where only i-th bit is 1 ,others are 0
        if((num & bitmask) == 0){ //num & bitmask isolates th i-th bit.
            //if the result is0, the i-th bit is0.Otherwise its 1.
           System.out.println("The" + i + "th bit is: 0");
        }else{
            System.out.println("The " + i + "th bit is :1");
        }
    }
    public static void main(String[] args) {
        int num = 13; //Binary : 1101
        int i = 2; // 0-based from right(LSB is 0)
         getIthBit(num, i);

       
    }
    
}
