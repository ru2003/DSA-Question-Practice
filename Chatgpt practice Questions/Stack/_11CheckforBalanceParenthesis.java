//. Check for Balanced Parentheses (()[]{} etc.)
/*real world use=>
 * 1)Compiler checks if your code has matching {}, (), []

   2)HTML/XML tag matching

   3)Expression validation in calculators
 */
/*
 * 🔍 Logic (Using Stack)
Use a stack to store opening brackets.

For each character in the string:

If it’s an opening bracket ( { [, push it onto the stack.

If it’s a closing bracket ) } ], check:

If stack is empty → ❌ Not balanced

If top of stack is matching open bracket → pop it

Else → ❌ Not balanced

In the end, if the stack is empty → ✅ Balanced.
 */

 import java.util.Stack;
public class _11CheckforBalanceParenthesis {

    public static boolean isbalanced(String str){
          Stack<Character> stack = new Stack<>();

          for(char ch: str.toCharArray()){
            //push opening brackets
            if(ch =='(' || ch =='{' || ch =='['){
                stack.push(ch);
            }

            //handle closing brackeets
            else if(ch==')' || ch=='}' || ch=='}') {
                if(stack.isEmpty()) return false;
            }
          }
    }
    
}
