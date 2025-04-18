package BitwiseManipulation;

public class ClearIBits {

    public static int clearIsBits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static void main(String [] args) {
        System.out.println(clearIsBits(15,2));
    }
    
}
