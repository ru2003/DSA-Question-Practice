package BitwiseManipulation;

public class SetIthBit {
    public static int setIthBit(int num, int i) {
        int bitmask = 1 << i; // Create a bitmask with 1 at the i-th position
        return num | bitmask; // Use OR to set the i-th bit
    }

    public static void main(String[] args) {
        int num = 10; // Binary: 1010
        int i = 2;
        int result = setIthBit(num, i);

        System.out.println("Original number: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("After setting bit at position " + i + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
