package BitwiseManipulation;
/*
 * Bitwise AND (&) rule:
 * It compares each bit of two numbers.
 * the result is 1 only if both bits are 1; otherwise its 0.
 * 5 = 101 (in binary)
   1 = 001 (in binary)
    -------------
   5 & 1 = 001 → which is 1
 
 * 
 */
public class OddEven {
    public static void main(String[] args){
        int num =5;
        if((num &1) == 1){
            System.out.println("The number is odd.");
        }else{
            System.out.println("The number is even.");
        }
    }
    
}
