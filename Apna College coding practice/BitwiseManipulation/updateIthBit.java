package BitwiseManipulation;

public class updateIthBit {
    public class ClearithBit {
        public static int cleartheBit(int n, int i) {
            int bitMask = ~(1 << i);
            return n & bitMask; 
        }
        public static int setIthBit(int num, int i) {
            int bitmask = 1 << i; // Create a bitmask with 1 at the i-th position  ===>this shifts the 1 to the left by i positions.
            return num | bitmask; /*  Use OR to set the i-th bit  
            -->a binary number with 1 at a specific position and 0 elsewhere .It helps target the bit you to changes.
            thi gives us a bitmask with only the "i" th bit set to 1.
            ===>this ensures the i-th bit of num is set to 1.without affecting the rest of the number.
            */
        }

    public static int updateIthBit(int n, int i, int newBit) {
       /* if(newBit == 0) {
            return cleartheBit(n,i) {
            }else {
                return setIthBit(n,i);
            }
        }
             */
            n = cleartheBit(n,i);
            int Bitmask = newBit<<i;



    }
    public static void main(String[] args) {

    }
    
}
