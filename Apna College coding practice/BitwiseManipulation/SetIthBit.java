package BitwiseManipulation;

public class SetIthBit {
    public static int setIthBit(int num, int i) {
        int bitmask = 1 << i; // Create a bitmask with 1 at the i-th position  ===>this shifts the 1 to the left by i positions.
        return num | bitmask; /*  Use OR to set the i-th bit  
        -->a binary number with 1 at a specific position and 0 elsewhere .It helps target the bit you to changes.
        thi gives us a bitmask with only the "i" th bit set to 1.
        ===>this ensures the i-th bit of num is set to 1.without affecting the rest of the number.
        */
    }

    public static void main(String[] args) {
        int num = 10; // Binary: 1010
        int i = 2; //set the 1st bit (from right, 0-indexed)
        int result = setIthBit(num, i);

        System.out.println("Original number: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("After setting bit at position " + i + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
