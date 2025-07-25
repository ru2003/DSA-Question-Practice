//Reverse a String using Stack
/*
 *- Stack follows LIFO (Last In First Out).

  - So if you push all characters of a string into a stack and then pop them one by one, you get the reverse order.


 */
import java.util.Stack;

public class _10ReverseAString {

    //method to reverse a string using stack
    static String reverse(String input){
        Stack<Character> stack = new Stack<>();

        //Push all character and build reversed string
        for(int i=0;i<input.length(); i++){
            stack.push(input.charAt(i));
        }

        //pop a;; character and build reversed string
        StringBuilder reversed = new StringBuilder();//stringbuilder is mutable class
        /*1)you can change its conent without creating new objects
         * 2)its optiomized for repeated appends .
         */
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args){
        String original = "Ruchita";

        String reversed = reverse(original);
        System.out.println("Original String: " + original);
        System.out.println("reversed String: " + reversed);

    }
    
}
