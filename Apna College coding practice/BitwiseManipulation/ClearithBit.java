package BitwiseManipulation;

public class ClearithBit {
    public static int cleartheBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask; 
    }
    public static void main(String[] args) {
        int n=13;
        int i=2;
        System.out.println();

    }
    
}
